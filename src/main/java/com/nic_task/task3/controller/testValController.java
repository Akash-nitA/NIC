package com.nic_task.task3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nic_task.task3.entity.Tests_valEntity;
import com.nic_task.task3.service.testValService;

@RestController
@RequestMapping("/test")
public class testValController {
	@Autowired
    private testValService testValService;

    @GetMapping
    List<Tests_valEntity> result()
    {
        return testValService.validate();
    }
    @GetMapping("/names")
    List<Tests_valEntity> getNames(){
    	return testValService.getAll();
    }
    @GetMapping("/api/validatereport")
    boolean hello(@RequestParam("tid") int tid,@RequestParam("res") float res,@RequestParam("unit") String unit,
    		@RequestParam("gender") String g,@RequestParam("age") int age) {

    	return testValService.checkReport(tid, res, unit, g, age);
    }
    @GetMapping("/api/checkreport")
    String checkReport(@RequestParam("tid") int tid,@RequestParam("res") float res,@RequestParam("unit") String unit,
    		@RequestParam("gender") String g,@RequestParam("age") int age) {
    	String s=testValService.getReport(tid, res, unit, g, age);
    	if(s==null) return "test case not found in database";
    	return s+" report";
    }


    
    
}
