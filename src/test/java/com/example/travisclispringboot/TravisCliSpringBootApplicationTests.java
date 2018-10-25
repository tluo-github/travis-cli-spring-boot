package com.example.travisclispringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class TravisCliSpringBootApplicationTests {

	@Test
	public void contextLoads() {
		assertEquals("123","123");
	}

}
