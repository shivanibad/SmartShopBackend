package com.cognizant.smartshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.smartshop.model.Log;
import com.cognizant.smartshop.service.LogService;



@RestController
@RequestMapping("/logs/mlogs")
public class LogController {

	@Autowired
	LogService logService;
	
	@GetMapping()
	public List<Log> getAllLogs() {
		return logService.getAllLogs();
	}
	
	@PostMapping
	public void insertLogs(@RequestBody Log log) {
		logService.insertLogs(log);
	}
}
