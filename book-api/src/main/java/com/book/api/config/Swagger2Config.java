package com.book.api.config;

import com.framework.common.spring.component.SpringComponent;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * @Description: swagger配置
 * @Author: J.W
 * @Date: 下午2:25 2017/11/22
 */
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket getSecurityDocket() {
        Boolean enableFlag = !SpringComponent.isProduct();
        List<Parameter> pars = Lists.newArrayList();
        ParameterBuilder tokenPar = new ParameterBuilder();
        tokenPar.name("Authorization")
                .description("令牌")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();
        pars.add(tokenPar.build());
        pars.add(this.addVersion().build());
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("security")
                .enable(enableFlag)
                .apiInfo(new ApiInfoBuilder().title("api安全接口").build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.book.api.business"))
                .paths(regex("/s.*"))
                .build()
                .globalOperationParameters(pars);
    }

    @Bean
    public Docket getAuthDocket() {
        Boolean enableFlag = !SpringComponent.isProduct();
        List<Parameter> pars = Lists.newArrayList();
        ParameterBuilder tokenPar = new ParameterBuilder();
        tokenPar.name("Authorization")
                .description("令牌")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(true)
                .build();
        pars.add(tokenPar.build());
        pars.add(this.addVersion().build());
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("auth")
                .enable(enableFlag)
                .apiInfo(new ApiInfoBuilder().title("api需要鉴权接口").build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.book.api.business"))
                .paths(regex("/a.*"))
                .build()
                .globalOperationParameters(pars);
    }

    /**
     * @return springfox.documentation.builders.ParameterBuilder
     * @Description 自定义头部属性：版本号
     * @Author J.W
     * @Date 2018/12/20 19:07
     * @Param []
     **/
    private ParameterBuilder addVersion() {
        return new ParameterBuilder().name("Version")
                .description("版本号")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false);
    }

}
