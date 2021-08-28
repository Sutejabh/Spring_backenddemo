package com.net.javaguides.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.net.javaguides.springbootbackend.model.Employee;
@Repository
public interface EmploteeRepository extends JpaRepository<Employee, Long>{

}
