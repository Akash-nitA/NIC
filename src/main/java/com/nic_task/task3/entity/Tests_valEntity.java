package com.nic_task.task3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tests_val")
public class Tests_valEntity {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "test_name")
    private String test_name;

    @Column(name = "age_from")
    private Integer age_from;

    @Column(name = "age_to")
    private Integer age_to;

    @Column(name = "gender")
    private String gender;

    @Column(name = "min_result")
    private Float min_result;

    @Column(name = "max_result")
    private Float max_result;

    @Column(name = "unit")
    private String unit;

    public Tests_valEntity() {
    }

    public Tests_valEntity(Integer id, String test_name, Integer age_from, Integer age_to, String gender,
            Float min_result, Float max_result, String unit) {
        this.id = id;
        this.test_name = test_name;
        this.age_from = age_from;
        this.age_to = age_to;
        this.gender = gender;
        this.min_result = min_result;
        this.max_result = max_result;
        this.unit = unit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public Integer getAge_from() {
        return age_from;
    }

    public void setAge_from(Integer age_from) {
        this.age_from = age_from;
    }

    public Integer getAge_to() {
        return age_to;
    }

    public void setAge_to(Integer age_to) {
        this.age_to = age_to;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Float getMin_results() {
        return min_result;
    }

    public void setMin_results(Float min_results) {
        this.min_result = min_results;
    }

    public Float getMax_results() {
        return max_result;
    }

    public void setMax_results(Float max_results) {
        this.max_result = max_results;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    

    

    
}
