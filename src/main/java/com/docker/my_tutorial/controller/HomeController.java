package com.docker.my_tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/index")
    public Mono<String> home() {

        return Mono.just("We are the world");
    }
}
