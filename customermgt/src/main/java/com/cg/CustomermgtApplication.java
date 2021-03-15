package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cg.ui.CustomerUi;

@SpringBootApplication
public class CustomermgtApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c = SpringApplication.run(CustomermgtApplication.class, args);
		CustomerUi cu = c.getBean(CustomerUi.class);
		cu.start();
	}

}
