package com.javatutorial;


public class JavaTutorial {
	public static void main(String [] args) {
		
		Employee worker = new Employee("Pedro");
		
		worker.setAge(25);

		worker.printEmployee();
		
		Dia dia;
		dia = Dia.LUNES;
		
		System.out.println(dia);
		System.out.println(dia.name());
		System.out.println(dia.ordinal());
		
		double [] arrayNumbers = {2, 4, 5, 10, 1};
		TestArray nArray = new TestArray(arrayNumbers);
		
		System.out.println(nArray.sumAllElement());
		System.out.println(nArray.maxElements());
		System.out.println(nArray.toString());
	}
}
