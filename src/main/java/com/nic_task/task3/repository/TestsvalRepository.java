package com.nic_task.task3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nic_task.task3.entity.Tests_valEntity;

public interface TestsvalRepository extends JpaRepository<Tests_valEntity, Integer>{
    @Query(value = "select * from tests_val",nativeQuery = true)
    public List<Tests_valEntity> getAll();
    @Query(value="SELECT EXISTS( SELECT * FROM tests_val AS r WHERE r.id = :tid AND r.age_from <= :age AND r.age_to >= :age AND r.gender = :g AND r.min_result <= :res AND r.max_result >= :res AND r.unit = :unit)",nativeQuery=true)
    public boolean checkReport(@Param("tid") int tid,@Param("res") float res,@Param("unit") String unit,
    		@Param("g") String g,@Param("age") int age);
    @Query(value="SELECT CASE WHEN t.age_from > :age OR t.age_to < :age THEN 'Invalid' WHEN :result > t.max_result THEN 'High' WHEN :result < t.min_result THEN 'Low' ELSE 'valid' END AS result_status FROM public.tests_val t WHERE t.id = :tid AND t.unit = :unit AND t.gender = :gender", nativeQuery=true)
    String getReport(@Param("tid") int testId, @Param("result") float result, @Param("unit") String unit,@Param("gender") String gender, @Param("age") int age);
}
