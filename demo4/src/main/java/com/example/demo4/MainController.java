package com.example.demo4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @PostMapping(value = "/epk")
    public String get() {

        return "Test";
    }
}
