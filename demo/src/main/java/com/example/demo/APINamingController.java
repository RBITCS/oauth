package com.example.demo;

import javax.validation.constraints.Min;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APINamingController {
	
	@GetMapping("/book/{id}")
    String findOne(@PathVariable @Min(1) Long id) {
        return "I was found";
    }
	
	@GetMapping("/books")
    String findAll() {
        return "I was found";
    }

}
