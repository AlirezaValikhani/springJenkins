package com.example.springjenkins;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.Assert.*;

@SpringBootTest
class SpringJenkinsApplicationTests {

    public static Logger logger = (Logger) LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case executing...");
        assertEquals(true,true);
    }
}
