package com.javanotetaking.designpattern;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DesignPatternApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
	}
}
