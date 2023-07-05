package com.nic_task.task3.service;

import java.util.List;


import com.nic_task.task3.entity.Tests_valEntity;

public interface testValService {
    List<Tests_valEntity> validate();
    List<Tests_valEntity> getAll();
    public boolean checkReport(int tid,float res,String unit,
    		String g,int age);
    public String getReport(int tid,float res,String unit,
    		String g,int age);
    
}
