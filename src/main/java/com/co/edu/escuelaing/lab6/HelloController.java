package com.co.edu.escuelaing.lab6;

import com.co.edu.escuelaing.lab6.GetMapping;
import com.co.edu.escuelaing.lab6.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public static String index() {
		return "Greetings from Spring Boot!";
	}

    @GetMapping("/pi")
	public static String getPi() {
		return "PI=" + Math.PI;
	}

    @GetMapping("/hello")
	public static String getHello() {
		return "Hello World!";
	}
}