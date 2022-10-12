package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Employee;

	@Repository
	public interface IEmployeeRepository extends JpaRepositoryImplementation<Employee , Integer> {

}
