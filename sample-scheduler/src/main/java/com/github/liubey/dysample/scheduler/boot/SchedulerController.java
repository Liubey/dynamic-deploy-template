package com.github.liubey.dysample.scheduler.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulerController {


    @GetMapping("/testScheduler")
    public String test() {
        return System.currentTimeMillis() +"";
    }
}
