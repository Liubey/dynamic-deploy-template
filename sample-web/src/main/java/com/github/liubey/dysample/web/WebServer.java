package com.github.liubey.dysample.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class WebServer implements PriorityOrdered {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void start() {

    }

    public void stop() {

    }

    @PostConstruct
    public void init() {
        logger.info("WebService startup");
    }

    @Override
    public int getOrder() {
        return HIGHEST_PRECEDENCE;
    }
}