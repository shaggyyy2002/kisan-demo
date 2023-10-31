package com.example.jaikisandemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
    public class hello {
        public String helloJaiKisan() {
            return "Hello Jai Kisan Team";
        }
}
