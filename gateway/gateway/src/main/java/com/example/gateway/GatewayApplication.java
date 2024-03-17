package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
public class GatewayApplication {
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("UserPortion", r -> r.path("/user/**")
						.uri("http://localhost:8090"))
				.route("HotelPortion", r -> r.path("/hotel/**")
						.uri("http://localhost:8091"))
				.route("RatingPortion", r -> r.path("/rating/**")
						.uri("http://localhost:8092"))
				.route("SecurityConfiguration", r -> r.path("/auth/**")
						.uri("http://localhost:8080"))
				.build();
	}

	public static void main(String[] args) {

		SpringApplication.run(GatewayApplication.class, args);
	}

}
