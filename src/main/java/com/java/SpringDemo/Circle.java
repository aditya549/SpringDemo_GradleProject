package com.java.SpringDemo;

public class Circle implements Shape{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private String[] names;
	
	public String[] getNames() {
		return names;
	}
	public void setNames(String[] names) {
		this.names = names;
	}
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Circle(Point pointC) {
		super();
		this.pointC = pointC;
	}
	public void printDisplay() {
		for (String s : names) {
			System.out.println("Traingle Types:"+s);
		}
		System.out.println("PointA("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("PointB("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("PointC("+pointC.getX()+","+pointC.getY()+")");
	}
	public void draw() {
		System.out.println("Circle Drawing.....!!!!!");
	}
	
}
