package com.demo.azure.apiazure;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/test")
    public String test() {
        return "Learning java to azure apiazure. Test";
    }
}

