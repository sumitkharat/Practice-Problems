package com.set1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmp {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(01, "Sumit", 23));
		list.add(new Employee(02, "Karan", 26));
		list.add(new Employee(03, "Rani", 22));
		list.add(new Employee(04, "Atharva", 23));
		list.add(new Employee(05, "Vandana", 45));
		list.add(new Employee(06, "Sandip", 48));

		System.out.println("Before sorting ");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		SortEmpByName name = new SortEmpByName();
		Collections.sort(list, name);
		System.out.println("-------------------------------------------------------");

		System.out.println("After name  sorting ");
		for (Employee names : list) {
			System.out.println(names);
		}

		System.out.println("-------------------------------------------------------------");

		SortEmpByAge age = new SortEmpByAge();
		Collections.sort(list, age);

		System.out.println("Before sorting ");
		for (Employee ages : list) {
			System.out.println(ages);
		}
	}
}
