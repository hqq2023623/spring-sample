package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zj.config.MyAutoProperties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private MyAutoProperties myAutoProperties;

	@Test
	public void contextLoads() {
		System.out.println(myAutoProperties.getName());
	}

}
