package com.github.liubey.dysample.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {


    @GetMapping("/testWeb")
    public String test() {
        return System.currentTimeMillis() +"";
    }
}
