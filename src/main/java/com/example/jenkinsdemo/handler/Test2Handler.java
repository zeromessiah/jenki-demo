package com.example.jenkinsdemo.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaiyujia
 * @date 2023/09/26
 */
@Component
@Slf4j
public class Test2Handler {

    public Mono<ServerResponse> test2(ServerRequest serverRequest) {
        log.info("请求进来了");
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromValue("test2"));
    }

    public Mono<ServerResponse> testAll(ServerRequest serverRequest) {
        log.info("testAll请求进来了");
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        return ServerResponse.ok().contentType(MediaType.TEXT_EVENT_STREAM).body(Flux.fromIterable(list).delayElements(Duration.ofSeconds(1L)), Integer.class);
    }
}
