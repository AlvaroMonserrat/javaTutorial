package com.javatutorial;

public class TestArray {
	
	double [] myList;
	TestArray(double [] myList){
		this.myList = myList;
	}
	
	double sumAllElement() {
		double sum = 0;	
		for (double element: myList) {
			sum += element;
		}
		return sum;
	}
	
	double maxElements(){
		double max = 0;
		for (int i=0; i < myList.length; i++) {
			if(max <= myList[i]) max = myList[i];
		}	
		return max;
	}
	
	@Override
	public String toString(){
		String sArray = "";
		
		for (int i=0; i < myList.length; i++) {
			sArray += String.valueOf(myList[i]) + " ";
		}
		return sArray;
	}
}
