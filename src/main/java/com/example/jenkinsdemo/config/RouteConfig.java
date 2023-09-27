package com.example.jenkinsdemo.config;

import com.example.jenkinsdemo.handler.Test2Handler;
import com.example.jenkinsdemo.handler.TestHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author zhaiyujia
 * @date 2023/09/26
 */
@Configuration
public class RouteConfig {

    @Bean
    public RouterFunction<ServerResponse> testRoute(TestHandler testHandler) {
        return RouterFunctions.nest(RequestPredicates.path("/test"), RouterFunctions.route(RequestPredicates.GET("/test"), testHandler::test));
    }

    @Bean
    public RouterFunction<ServerResponse> test2Route(Test2Handler test2Handler) {
        return RouterFunctions.nest(RequestPredicates.path("/test2"), RouterFunctions.route(RequestPredicates.GET("/test2"), test2Handler::test2)
                .andRoute(RequestPredicates.GET("/testAll"), test2Handler::testAll));
    }
}
