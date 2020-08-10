package com.cognizant.smartshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.smartshop.model.Log;

public interface ILogRepository extends JpaRepository<Log, Long>{

}
