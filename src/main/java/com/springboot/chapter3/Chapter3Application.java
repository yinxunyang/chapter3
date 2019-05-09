package com.springboot.chapter3;

import com.springboot.chapter3.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*@ComponentScan(basePackages = "com.springboot.chapter3.*", excludeFilters = {@ComponentScan.Filter
		(classes = {UserService.class})})*/
// ComponentScan只会扫描本类所在的当前包及其子包
public class Chapter3Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter3Application.class, args);
	}

}
