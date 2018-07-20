package com.example.demo;
import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		/*return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();*/
	
        return new Docket(DocumentationType.SWAGGER_2).groupName("swagger-demo-api")
				.apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
                .paths(regex("/.*"))
                .build();

	}
	
	

	/*private Predicate<String> postPaths() {
		return or(regex("/.*"), regex("/.*"));
	}
*/
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Swagger API")
				.description("Demo app for enable swagger in spring boot app")
				.termsOfServiceUrl("http://bharat.darawade.com")
				.contact("bharatdarawade1134@gmail.com").license("JavaInUse License")
				.licenseUrl("javainuse@gmail.com").version("1.0").build();
	}

}
