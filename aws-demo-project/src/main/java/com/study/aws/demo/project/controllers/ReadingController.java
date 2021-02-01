package com.study.aws.demo.project.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ReadingController {
	@PostMapping(path="/showreadings")
	public String showreadings(@RequestBody String name)
	{
		return "post readings";
		
	}
	
	@GetMapping("/showreadings")
	public String  getAllStudents()
	{
		return "get readings";
		
	}

}
