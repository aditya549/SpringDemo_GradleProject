package com.java.aspects;  
  
class sample{
	public void sum() {
		System.out.println("sum sample");
	}
	public void mul() {
		System.out.println("mul sample");
	}
}
class example extends sample{ 
	public void add() {
		System.out.println("add exapmle");
	}
	public void sum() {
		System.out.println("sum exapmle");
	}
}
public class AspectsDemo{
	public static void main(String[] args) {

	example e1=(example) new sample();
	e1.add();
	e1.sum();
	//e.add();
	
	
	
}
}
