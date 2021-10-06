package fr.dauphine.javaavance.td1;

// Exercice 5:

// 2.
public class Circle {
	Point circle;
	double radius;
	
	public Circle() {}
	
	public Circle(Point p,double r) {
		circle = p;
		radius = r;
	}	
	
	// 3. 
	public String toString() {
		return "Center of the circle is : (" + circle.getX() + "," + circle.getY() + ") and him radius is :" + radius;
	}

	// 4.
	public void translate(int dx, int dy){
		int Dx = circle.getX() + dx;
		int Dy = circle.getY() + dy;
		circle.setX(Dx);
   		circle.setY(Dy);
	}
	
	public static void main(String[] args) {
		Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c2.translate(1,1);
		System.out.println(c+"\n"+c2);
	}
}
