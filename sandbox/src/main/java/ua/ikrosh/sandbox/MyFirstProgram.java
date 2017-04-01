package ua.ikrosh.sandbox;

public class MyFirstProgram {
	
	public static void main (String[] args) {
		hello("world");
		hello("user");
		hello("Iren");

		Square s = new Square(5);
		System.out.println("Площадь квадрата с стороной " + s.l + " = " + area(s));

		Rectangle r = new Rectangle(4,6);
		System.out.println("Площадь прямоугольника с сторонами " + r.a + " и " + r.b + " = " + area(r));
	}


	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!!!");
	}

	private static double area(Square s) {
		return s.l * s.l;
	}

	private static double area(Rectangle r) {
		return r.a * r.b;
	}

}