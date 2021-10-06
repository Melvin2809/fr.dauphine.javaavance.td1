package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

// Exercice 4:

// 1.
public class PolyLine {
	ArrayList<Point> list = new ArrayList<Point>();
	
	public PolyLine() {
		System.out.println("the polygonal line is created and empty");
	}
	
	// 2. if we add more points that the maximum capacity of the array, him capacity will rise of himself
	public void addPointToPolyLine(Point p) {
		list.add(p);
		System.out.println("An object Point has been added to List ");
	}
	
	public static void main(String[] args) {
		PolyLine poly = new PolyLine();
		Point p = new Point(1,2);
		Point p2 = new Point(2,4);
		Point p3 = new Point(null);
		
		poly.addPointToPolyLine(p);
		poly.addPointToPolyLine(p3);
		
		//System.out.println(poly.toString());
		System.out.print(poly.contains(p3));
		
	}
	
	public String toString() {
		return "(" + list.get(2) +")." ;
	}
	
	// 3.
	public int pointCapacity() {
		return 1;
	}
	
	public int nbPoints() {
		return list.size();
	}

	// 4.
	public boolean contains(Point p) {
		for(Point pList : list) {
			if(p.getX() == pList.getX() && p.getY() == pList.getY())
				return true;
		}
		return false;
	}
	
	//5. If we put null,there is an expection.
	//   Before it's true.
}
