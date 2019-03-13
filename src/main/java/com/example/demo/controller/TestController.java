package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class TestController {

    @GetMapping("/")
    public String trest() throws UnknownHostException {
        return "Hello from my Java Project !  Notre Hostname actuellement la est : " + InetAddress.getLocalHost().getHostName();
    }
}
