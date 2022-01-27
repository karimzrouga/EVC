package com.app.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvcApplication.class, args);
	}
	/*@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS", "HEAD")
				.allowedHeaders( "Authorization",
		                "Accept",
		                "Cache-Control",
		                "Content-Type",
		                "Origin",
		                "ajax", 
		                "x-csrf-token",
		                "x-requested-with");
			}
		};
	}*/

}
