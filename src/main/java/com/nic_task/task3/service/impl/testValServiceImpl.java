package com.nic_task.task3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nic_task.task3.entity.Tests_valEntity;
import com.nic_task.task3.repository.TestsvalRepository;
import com.nic_task.task3.service.testValService;


@Service
public class testValServiceImpl implements testValService{
	
	@Autowired
    private TestsvalRepository testsvalRepository;

    @Override
    public List<Tests_valEntity> validate() {
        List<Tests_valEntity> ls;
        // List<Integer> ids = List.of(id);

        ls = testsvalRepository.findAll();
        return ls;
        // return testsvalRepository.findAll();
    }

	@Override
	public List<Tests_valEntity> getAll() {
		// TODO Auto-generated method stub
		return testsvalRepository.getAll();
	}

	@Override
	public boolean checkReport(int tid, float res, String unit, String g, int age) {
		// TODO Auto-generated method stub
		return testsvalRepository.checkReport(tid, res, unit, g, age);
	}

	@Override
	public String getReport(int tid, float res, String unit, String g, int age) {
		// TODO Auto-generated method stub
		return testsvalRepository.getReport(tid, res, unit, g, age);
	}    
}
