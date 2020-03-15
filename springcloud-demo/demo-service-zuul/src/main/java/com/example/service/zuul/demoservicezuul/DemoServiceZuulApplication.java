package com.example.service.zuul.demoservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//开启zuul的功能
@EnableZuulProxy
public class DemoServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceZuulApplication.class, args);
	}

}
