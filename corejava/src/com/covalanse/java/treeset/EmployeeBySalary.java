package com.covalanse.java.treeset;

import java.util.Comparator;

public class EmployeeBySalary implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2) {
		if(e1.salary>e2.salary) {
			return 1;
		}
		else if(e1.salary<e2.salary) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
