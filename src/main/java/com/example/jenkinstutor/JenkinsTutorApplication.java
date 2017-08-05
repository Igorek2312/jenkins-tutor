package com.example.jenkinstutor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication
@ImportResource("classpath:config.xml")
public class JenkinsTutorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsTutorApplication.class, args);
	}

}
