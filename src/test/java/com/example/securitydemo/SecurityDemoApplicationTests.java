package com.example.securitydemo;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecurityDemoApplicationTests {
	@Autowired
	IDemoService service;

	@Test
	void shouldBeSecure() {
		assertThatCode(() -> service.methodWithParameter(new DemoEntity()))
			.isNotNull();
	}

}
