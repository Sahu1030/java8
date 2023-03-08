package com.sarat.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("282741", "Atjun", "IT"));
		empList.add(new Employee("234364", "Saurabh","Mechanical"));
        empList.add(new Employee("242741", "Manikandan", "IT"));
        empList.add(new Employee("245564", "Amir", "CompSc"));
        empList.add(new Employee("253455", "Gaurav", "IT") );
        empList.add(new Employee("224343", "Debasis", "CompSc"));
        empList.add(new Employee("215267", "Sambit", "Mechanical"));
        
//        Map<Department, List<String>> EmpNamesDeptWise = empList.stream().collect(Collectors.groupingBy(Employee1 :: getDept, 
//        		Collectors.mapping(Employee1 :: getEmpName, Collectors.toList())));
//        
        Map<String, List<String>> EmpNamesDeptWise = empList.stream().collect
        		(Collectors.groupingBy(Employee::getDept ,Collectors.mapping(Employee :: getEmpName, Collectors.toList())));
        System.out.println(EmpNamesDeptWise);
        

	}

}

class Employee {
	private String empId;
	private String empName;
	private String dept;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee(String empId, String empName, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", dept=" + dept + "]";
	}

}