package com.tyss.corejava.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		List<Employee> asList = Arrays.asList(new Employee(1, "Dinesh", "Tester", 35000),
				new Employee(2, "Nallish", "Tester", 30000), new Employee(3, "Abisheka", "Tester", 45000),
				new Employee(4, "Isrin", "Tester", 50000), new Employee(5, "Divya", "Tester", 35000));
       
		Collections.sort(asList);
		System.out.println(asList.get(asList.size()-1));
		System.out.println("=====================================");
		
		double max1 =0;
		for(int i=0;i<asList.size();i++) {
			if(asList.get(i).getSalary()>max1) {
				max1 = asList.get(i).getSalary();
			}
		}
		System.out.println(max1);
		
		Stream<Employee> stream = asList.stream();
		Comparator<Employee> com = (o1, o2) -> {
			return (int) (o1.getSalary() - o2.getSalary());
		};
		Optional<Employee> max = stream.max(com);
		System.out.println(max);
		System.out.println("=====================================");
		asList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
		System.out.println(asList.stream().max(Comparator.comparing(Employee::getSalary)).get().getSalary());
		System.out.println(max.get().getSalary());
	}
}
