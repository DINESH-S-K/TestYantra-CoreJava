package com.tyss.collection.list.ArrayListEx.ListOfObjects;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) ((int)o1.salary - o2.salary);
	}

}
