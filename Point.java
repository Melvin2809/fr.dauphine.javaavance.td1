package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Point {
	
	// Exercice 2
	
	static int nbPoints;
	private int x;
	private int y;
	
	public Point() {
		
		nbPoints++;
	}
	
	// 8. The compiler know which constructor to call in terms of the arguments.
	public Point(Point p2) {
		this.x = p2.x;
		this.y = p2.y;
		nbPoints++;
	}
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
		nbPoints++;
	}
	
	// 1. It Does work because the method main is in the class to acces directly to the variables
	
	
	/*public static void main(String[] args) {
		Point p = new Point();
		//System.out.println(p.x+" "+p.y);
		
		//Continuation of 8:
		Point point = new Point();
		
	// 9.
		System.out.println(point);
	}*/
	
	
	// 9. It's necessary to make a method toString() :
	@Override
	public String toString() {
		
		return "(" + this.getX() + "," + this.getY() + ")";
	}

	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	//********************************************************************************//
	
	// Exercice 3:  
	
	// 2.
	boolean isSameAs(Point p){
		if(this.getX() == p.getX() && this.getY() == p.getY())
			return true;
		return false;
	}
	
	// 3. We didn't import the "java.util.ArrayList and we need to add p3 to the list."
	
	/*public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1,2);
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		list.add(p3);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
	}*/
	
}
