package de.baitando.tutorials.spring.perflog.service.impl;

import de.baitando.tutorials.spring.perflog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public List<String> getUsernames() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            log.error("Interrupted while sleeping", e);
        }
        return Arrays.asList("test-1", "test-2", "test-3");
    }
}
