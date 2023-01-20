package com.springboot.docker;

import com.springboot.docker.api.MessageController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MessageControllerTest {
    @Autowired
    MessageController messageController;

    @Test
    void testMessage() {
        Assertions.assertEquals("Welcome to dockerized application..!!", messageController.getMessage());
    }

}
