package com.thinkitive.microservice.apigateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("httpbin_route", r -> r
                        .path("/get")
                        .filters(f -> f
                                .addRequestHeader("MyHeader", "MyURI")
                                .addRequestParameter("Param", "MyValue"))
                        .uri("http://httpbin.org:80"))
                .route("currency_exchange_route", r -> r
                        .path("/currency-exchange/**")
                        .uri("lb://currency-exchange-service"))
                .route("currency_conversion_route", r -> r
                        .path("/currency-conversion-service/**")
                        .uri("lb://currency-conversion"))
                .route("currency_conversion_feign_route", r -> r
                        .path("/currency-conversion-feign/**")
                        .uri("lb://currency-conversion-service"))
                .route("currency_conversion_new_route", r -> r
                        .path("/currency-conversion-new/**")
                        .filters(f -> f.rewritePath(
                                "/currency-conversion-new/(?<segment>.*)",
                                "/currency-conversion-feign/${segment}"))
                        .uri("lb://currency-conversion"))
                .build();
    }

    @Bean
    public org.springframework.web.client.RestClient.Builder restClientBuilder() {
        return org.springframework.web.client.RestClient.builder();
    }
}