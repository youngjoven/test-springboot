package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import com.example.demo.config.AppConfig;
import com.example.demo.config.WebConfig;

@SpringBootTest
@ContextConfiguration(classes = { AppConfig.class, WebConfig.class })
public class WebAppInitializerTests {

	@Test
	void contextLoads() {
	}
}
