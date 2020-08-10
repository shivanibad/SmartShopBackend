package com.cognizant.smartshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.smartshop.model.Log;
import com.cognizant.smartshop.repository.ILogRepository;

@Service
public class LogService {

	@Autowired
	private ILogRepository logRepository;
	
	public List<Log> getAllLogs() {
		return logRepository.findAll();
	}
	
	public void insertLogs(Log log) {
		logRepository.save(log);
	}
}
