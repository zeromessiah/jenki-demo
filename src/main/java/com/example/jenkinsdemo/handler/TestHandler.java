package com.example.jenkinsdemo.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author zhaiyujia
 * @date 2023/09/26
 */
@Component
@Slf4j
public class TestHandler {

    public Mono<ServerResponse> test(ServerRequest serverRequest) {
        log.info("请求进来了");
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromValue("test"));
    }
}
