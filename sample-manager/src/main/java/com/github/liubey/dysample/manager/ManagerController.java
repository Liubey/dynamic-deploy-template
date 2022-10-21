package com.github.liubey.dysample.manager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {

    @GetMapping("/testManager")
    public String test() {
        return System.currentTimeMillis() +"";
    }
}
