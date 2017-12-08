package com.nchu.swagger2.config.swagger2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/12/8 11:17
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    /***
     * 再通过createRestApi函数创建Docket的Bean之后，apiInfo()
     * 用来创建该Api的基本信息（这些基本信息会展现在文档页面中）。
     * select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现，
     * 本例采用指定扫描的包路径来定义，Swagger会扫描该包下所有Controller定义的API，
     * 并产生文档内容（除了被@ApiIgnore指定的请求）。
     * @return
     */
    @Bean
    public Docket createRestApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.nchu.swagger2.action"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

    private ApiInfo apiInfo() {
        ApiInfoBuilder infoBuilder = new ApiInfoBuilder();
        ApiInfo apiInfo = infoBuilder.title("spring boot 中使用Swagger2 构建RESTful APIs")
                .description("spring boot 集成swagger2的基础教程")
                .termsOfServiceUrl("https://www.baidu.com")
                .contact("nchufujianjian@sina.cn")
                .version("1.0")
                .build();
        return apiInfo;
    }

}
