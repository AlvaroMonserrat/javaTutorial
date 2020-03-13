package com.javatutorial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class JavaTutorial {
	public static void main(String [] args) {
		
		Employee secretary = new Employee("Pedro");
		secretary.setAge(25);
		
		Employee engineer = new Employee("Maria");
		engineer.setAge(28);
		
		Set<Employee> conjunto = new HashSet<Employee>();
		conjunto.add(secretary);
		conjunto.add(engineer);
		
		for(Employee r: conjunto) {
			r.printEmployee();
		}
		
		ArrayList<Employee> lista = new ArrayList<Employee>();
		lista.add(new Employee("Alvaro"));
		lista.add(new Employee("Paly"));
		lista.add(new Employee("Pato"));
		lista.add(new Employee("Gato"));
		
		for(Employee element: lista) {
			System.out.println(element.getName());
		}
		
		double [] arrayNumbers = {2, 4, 5, 10, 1};
		TestArray nArray = new TestArray(arrayNumbers);
		System.out.println(nArray.sumAllElement());
		System.out.println(nArray.maxElements());
		System.out.println(nArray.toString());
		
		DataDemo newDate = new DataDemo();
		System.out.println(newDate.datePrint());
		

		
	}
}
