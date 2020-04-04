package com.shubh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	private static Logger logger=LoggerFactory.getLogger(ApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("test case execution");
		assertEquals(true, true);
	}

}
