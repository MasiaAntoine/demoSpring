package com.example.demoSpring;

import com.example.demoSpring.model.ObjetExemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringApplication {

	public static void main(String[] args) {
		System.out.println("==============================>  main");
		System.out.println("==============================>  main");
		System.out.println("==============================>  main");
		System.out.println("==============================>  main");
		SpringApplication.run(DemoSpringApplication.class, args);
	}

	@GetMapping("/")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/user/{name}")
	public String greet(@PathVariable String name) {
		return "utilisateur, " + name + "!";
	}

	@GetMapping("/objetExemple")
	public ObjetExemple getObjetExemple() {
		return new ObjetExemple("Jean", 25);
	}
}
