package com.demo.spring.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DemoSpringBootApplicationTests {

	@Test
	public void contextLoads() {
		Assert.isTrue(true);
		System.out.println("%%%%%%%% Junit test case passed... %%%%%%%%%%%%%");
	}

}
