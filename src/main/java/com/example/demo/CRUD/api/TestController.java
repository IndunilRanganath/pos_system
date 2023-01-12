package com.example.demo.CRUD.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/test")
@RestController

public class TestController {

        @GetMapping("/access")
        public String access(){
            return "hello Spring worls.!";
    }
}
