package com.bgmi.squad.bgmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bgmi.squad.bgmi")
public class BgmiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BgmiApplication.class, args);
	}

}
