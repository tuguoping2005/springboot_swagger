package com.intalent.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration//加载该类到配置文件中  http://localhost:8080/swagger-ui.html
@EnableSwagger2 //启动swagger2
public class SwaggerConfig {

    //配置了Swagger的Docket的Bean实例
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }

    //配置Swagger信息=apiInfo

    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("William","http://www.baidu.com","rrr@qq.com");
        return new ApiInfo(
                "William Swagger API文档",
                "api个人描述文档",
                "http://www.baidu.com",
                "http://www.baidu.com",
                contact,
                "Apache 2.0",
                "http://www.baidu.com",
                new ArrayList()
        );
    }


}
