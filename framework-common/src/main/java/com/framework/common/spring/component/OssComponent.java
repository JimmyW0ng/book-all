package com.framework.common.spring.component;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.ObjectMetadata;
import com.framework.common.constant.CommonMessage;
import com.framework.common.spring.pojo.dto.ResultDto;
import com.framework.common.tool.DateTools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.Date;
import java.util.UUID;

/**
 * @Description: 阿里云Oss组件
 * @Author: J.W
 * @Date: 下午3:12 2018/8/6
 */
@Slf4j
public class OssComponent {

    @Value("${oss.accessKeyId}")
    private String accessKeyId;
    @Value("${oss.accessKeySecret}")
    private String accessKeySecret;
    @Value("${oss.endPoint}")
    private String endPoint;
    @Value("${oss.public.bucketName}")
    private String publicBucketName;
    @Value("${oss.private.bucketName}")
    private String privateBucketName;

    /**
     * @Description 私有上传
     * @Author J.W
     * @Date 2018/12/22 12:45 PM
     * @Param [fileName, bytes]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<java.lang.String>
     **/
    public ResultDto<String> uploadPrivate(String fileName, byte[] bytes) {
        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endPoint, accessKeyId, accessKeySecret);
        String fileKey = null;
        try {
            // 本地生成fileKey
            fileKey = UUID.randomUUID() + "." + fileName.substring(fileName.lastIndexOf(".") + 1);
            log.info("上传阿里云开始, fileName={}, fileKey={}, bytesLength={}", fileName, fileKey, bytes.length);
            // 上传文件
            ObjectMetadata meta = new ObjectMetadata();
            // 设置MD5校验。
            String md5 = BinaryUtil.toBase64String(BinaryUtil.calculateMd5(bytes));
            meta.setContentMD5(md5);
            // 指定此文件在服务器端的加密编码为AES256。
            meta.setServerSideEncryption(ObjectMetadata.AES_256_SERVER_SIDE_ENCRYPTION);
            ossClient.putObject(privateBucketName, fileKey, new ByteArrayInputStream(bytes));
            // 返回
            ResultDto<String> resultDto = ResultDto.build();
            return resultDto.setResult(fileKey);
        } catch (Exception e) {
            log.error("上传阿里云报错, fileName={}, fileKey={}, bytesLength={}", fileName, fileKey, bytes.length, e);
            return ResultDto.build(CommonMessage.ERROR_OSS_UPLOAD);
        } finally {
            // 关闭OSSClient
            ossClient.shutdown();
        }
    }

    /**
     * @Description 公共上传，并返回地址
     * @Author J.W
     * @Date 2018/12/22 12:45 PM
     * @Param [fileName, bytes]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<java.lang.String>
     **/
    public ResultDto<String> uploadPublic(String fileName, byte[] bytes) {
        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endPoint, accessKeyId, accessKeySecret);
        String fileKey = null;
        try {
            // 本地生成fileKey
            fileKey = UUID.randomUUID() + "." + fileName.substring(fileName.lastIndexOf(".") + 1);
            log.info("上传阿里云开始, fileName={}, fileKey={}, bytesLength={}", fileName, fileKey, bytes.length);
            ossClient.putObject(publicBucketName, fileKey, new ByteArrayInputStream(bytes));
            // 返回
            ResultDto<String> resultDto = ResultDto.build();
            String fileUrl = "https://" + publicBucketName + "." + endPoint + "/" + fileKey;
            return resultDto.setResult(fileUrl);
        } catch (Exception e) {
            log.error("上传阿里云报错, fileName={}, fileKey={}, bytesLength={}", fileName, fileKey, bytes.length, e);
            return ResultDto.build(CommonMessage.ERROR_OSS_UPLOAD);
        } finally {
            // 关闭OSSClient
            ossClient.shutdown();
        }
    }

    /**
     * @Description 获取文件访问地址
     * @Author J.W
     * @Date 2018/12/22 12:45 PM
     * @Param [fileKey]
     * @Return com.framework.common.spring.pojo.dto.ResultDto<java.lang.String>
     **/
    public ResultDto<String> getPrivateUrl(String fileKey) {
        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endPoint, accessKeyId, accessKeySecret);
        try {
            // 设置URL过期时间为5分钟。
            Date expiration = DateTools.addMinute(DateTools.getCurrentDate(), 5);
            // 生成以GET方法访问的签名URL，访客可以直接通过浏览器访问相关内容。
            log.info("阿里云获取文件访问地址开始, fileKey={}, expiration={}", fileKey, expiration);
            URL url = ossClient.generatePresignedUrl(privateBucketName, fileKey, expiration);
            // 返回
            ResultDto<String> resultDto = ResultDto.build();
            return resultDto.setResult(url.toExternalForm());
        } catch (Exception e) {
            log.error("阿里云获取文件访问地址报错, , fileKey={}", fileKey, e);
            return ResultDto.build(CommonMessage.ERROR_OSS_GENERATE_URL);
        } finally {
            // 关闭OSSClient
            ossClient.shutdown();
        }
    }

}
