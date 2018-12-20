package com.book.api.config;

import com.geai.spring.component.SpringComponent;
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
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = Lists.newArrayList();
        tokenPar.name("Authorization")
                .description("令牌")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();
        ParameterBuilder versionPar = new ParameterBuilder();
        versionPar.name("Version")
                .description("版本号")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();
        pars.add(tokenPar.build());
        pars.add(versionPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("security")
                .enable(enableFlag)
                .apiInfo(new ApiInfoBuilder().title("api安全接口").build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.geai.asset.api.controller"))
                .paths(regex("/security.*"))
                .build()
                .globalOperationParameters(pars);
    }

    @Bean
    public Docket getAuthDocket() {
        Boolean enableFlag = !SpringComponent.isProduct();
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = Lists.newArrayList();
        tokenPar.name("Authorization")
                .description("令牌")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(true)
                .build();
        ParameterBuilder versionPar = new ParameterBuilder();
        versionPar.name("Version")
                .description("版本号")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();
        pars.add(tokenPar.build());
        pars.add(versionPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("auth")
                .enable(enableFlag)
                .apiInfo(new ApiInfoBuilder().title("api需要鉴权接口").build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.geai.asset.api.controller"))
                .paths(regex("/auth.*"))
                .build()
                .globalOperationParameters(pars);
    }

}
