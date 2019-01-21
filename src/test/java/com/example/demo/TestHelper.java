package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.web.reactive.server.WebTestClient;

@Component
public class TestHelper {

    @Autowired
    private WebTestClient webTestClient;

    public void check() {
        webTestClient.get();
    }
}
