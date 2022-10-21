package com.github.liubey.dysample.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TaskManagerServer implements InitializingBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskManagerServer.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("ManagerServer startup");
    }
}
