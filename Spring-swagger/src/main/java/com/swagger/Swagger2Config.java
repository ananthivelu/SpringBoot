package com.swagger;

/*import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.models.Contact;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.Collections;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
	
@Bean
public Docket swaggerConfig()
{
	return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.paths(PathSelectors.ant("/api/*"))
			.build()
			.apiInfo(new ApiInfo("movies api", "movie management api description", 
					"1.0", "http://swagger.com/termsofuse", 
					new Contact("name", "url", "info@swagger.com"), 
					"opensource", "http://swagger.com/license", 
					Collections.emptyList()));
}

}		*/

/*
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Config {

@SuppressWarnings("deprecation")
@Bean
public Docket swaggerConfig() {
return new Docket(DocumentationType.SWAGGER_2)
.select()
.paths(PathSelectors.ant("/api/*"))
.build()
.apiInfo(new ApiInfo("movies api", "demo application", "3.0.0", "http://localhost:9090/", "Ananthi V",
"issued", "debricated"));
//
}
}*/