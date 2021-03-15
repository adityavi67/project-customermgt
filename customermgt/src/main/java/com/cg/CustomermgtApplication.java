package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cg.ui.CustomerMain;

@SpringBootApplication
public class CustomermgtApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c = SpringApplication.run(CustomermgtApplication.class, args);
		CustomerMain cu = c.getBean(CustomerMain.class);
		cu.start();
	}

}
