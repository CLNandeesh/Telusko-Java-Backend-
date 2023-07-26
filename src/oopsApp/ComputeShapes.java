package oopsApp;

import java.util.Scanner;

abstract class Shape {
	public double area;
	Scanner sc = new Scanner(System.in);

	public void dispaly() {
		System.out.println("AREA is: " + area);
	}

	abstract public void input();

	abstract public void compute();

}

class Rectangle extends Shape {

	float length;
	float breadth;

	@Override
	public void input() {
		System.out.println("Enter Length");
		length = sc.nextFloat();
		System.out.println("Enter Breadth");
		breadth = sc.nextFloat();

	}

	@Override
	public void compute() {
		area = length * breadth;

	}

}

class Circle extends Shape {

	float pi = 22.7f;
	float radius;

	@Override
	public void input() {
		System.out.println("Enter Radius");
		radius = sc.nextFloat();

	}

	@Override
	public void compute() {
		area = pi * radius * radius;

	}

}

class Geometry {
	public void calculate(Shape shape) {
		shape.input();
		shape.compute();
		shape.dispaly();
	}
}

public class ComputeShapes {

	public static void main(String[] args) {

		/*
		 * Shape r = new Rectangle(); r.input(); r.compute(); r.dispaly();
		 * 
		 * System.out.println("*****************");
		 * 
		 * Shape c = new Circle(); c.input(); c.compute(); c.dispaly();
		 */

		Rectangle r = new Rectangle();
		Circle c = new Circle();

		Geometry g = new Geometry();
	//	g.calculate(r);
		g.calculate(c);
		

	}

}
