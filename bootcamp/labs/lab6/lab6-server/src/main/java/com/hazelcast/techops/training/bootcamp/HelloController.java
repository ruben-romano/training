package com.hazelcast.techops.training.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * A minimal REST controller, two GET endpoints returning plain text.
 */
@RestController
public class HelloController {

	// GET /hello
	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}

	// GET /hello/{name}
	@GetMapping("/hello/{name}")
	public String helloName(@PathVariable String name) {
		return "Hello, " + name + "!";
	}

}
