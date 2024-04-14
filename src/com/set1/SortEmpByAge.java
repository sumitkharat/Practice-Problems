package com.set1;

import java.util.Comparator;

public class SortEmpByAge implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return Integer.compare(emp1.getAge(), emp2.getAge());
	}

}
