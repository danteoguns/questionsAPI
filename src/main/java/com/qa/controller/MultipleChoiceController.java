package com.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.service.IMultipleChoice;

@RequestMapping("/dictionary")
@RestController
public class MultipleChoiceController {
	
	@Autowired
	private IMultipleChoice service;
	
	@RequestMapping("/get-definition/{key}")
	@ResponseBody
	public String getDefinition(@PathVariable String key) {	
		return key + ": " + service.getDefinition(key) + "\n";
	}
	
	
	@GetMapping("/get-all-definitions")
	@ResponseBody
	public String getAllDefinitions() {
		return service.getAllDefinitions() + "\n";
	}

}