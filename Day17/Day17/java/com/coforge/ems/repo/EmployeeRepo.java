package com.coforge.ems.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.ems.model.Employee;

//public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

	public List<Employee> findByEname(String ename);

	public int deleteByEname(String ename);// deleteBy or removeBy is like akeyword and should be done when deleting or
											// finding it is findBy or findAll etc

	public List<Employee> findByDno(int dno);

	public int deleteByDno(int dno);

	// Custom Query Methods
//it is a DQL thats why in service no need to write @transaction if it is a dml we have to write it

	@Query("SELECT eid FROM Employee")
	public List<Integer> getEids();

	@Query("SELECT COUNT(*), SUM(esalary), MIN(esalary), MAX(esalary) FROM Employee")
	public String getInfo();
}
