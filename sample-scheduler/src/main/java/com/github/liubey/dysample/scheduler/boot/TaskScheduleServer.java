package com.github.liubey.dysample.scheduler.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * ScheduleServer
 */
@Component
public class TaskScheduleServer implements PriorityOrdered {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void start() {

    }

    public void stop() {

    }

    @PostConstruct
    public void init() {
        logger.info("TaskScheduleServer startup");
    }

    @Override
    public int getOrder() {
        return HIGHEST_PRECEDENCE;
    }
}