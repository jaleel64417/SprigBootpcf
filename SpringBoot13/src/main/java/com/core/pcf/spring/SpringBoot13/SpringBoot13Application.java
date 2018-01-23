package com.core.pcf.spring.SpringBoot13;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBoot13Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot13Application.class, args);
	}
}


@RestController
class MessageRestController {

	@RequestMapping("/hello")
	String getMsg(@RequestParam(value = "name") String name) {
		String rsp = "Hi" + name;
		new Date();
		System.out.println(rsp);
		return rsp;

	}
}