package com.tega.departmentservice.repository;

import com.tega.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findDepartmentById(Long id);

}
