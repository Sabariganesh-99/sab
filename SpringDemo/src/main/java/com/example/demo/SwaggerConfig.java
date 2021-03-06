package com.example.demo;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;

import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
@Bean
public Docket postsApi() {
return new Docket(DocumentationType.SWAGGER_2).groupName("customer-api").apiInfo(apiInfo()).select().paths(Postpaths()).build();

}
private Predicate<String> Postpaths()
{
	return or(regex("/customers/,*"),regex("/customers/.*"));
}
private ApiInfo apiInfo()
{
	return new ApiInfoBuilder().title("Customer API").description("sab API reference for Developers").termsOfServiceUrl("https://sabari.com").license("sabariganeshLicense")
			.licenseUrl("sabariganesh.17raju@gmail.com").version("1.0").build();
}
}
