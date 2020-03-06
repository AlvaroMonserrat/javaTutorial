package com.javatutorial;


public class Employee {
	
	private String name;
	private int age;
	
	//Este es el constructor de la clase Employee
	public Employee(String name){
		this.name = name;
		this.age = 0;
	}
	
	//Método para ingresar edad
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void printEmployee() {
		System.out.println("El empleado se llama: " + getName());
		System.out.println("El empleado tiene la edad de: " + getAge() + " años");
	}
	
}
