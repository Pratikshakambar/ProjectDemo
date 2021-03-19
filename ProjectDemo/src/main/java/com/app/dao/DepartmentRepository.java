package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
