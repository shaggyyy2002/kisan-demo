package com.example.jaikisandemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @RequestMapping("/hello")    
    public String helloJaiKisan() {
        return "<h1>Hello Jai Kisan Team, </h1><br>  <h2>This is Nitin's DevOps take away assignment demo</h2>";
    }
}
