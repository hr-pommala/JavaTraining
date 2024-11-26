package overriding;

/*
 * Method Overriding with Return Type and Parameters
 */

class Shape {

	double area() {
		return 0.0;
	}

}

class Circle extends Shape {

	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}

}

class Rectangle extends Shape {

	double length, width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}

	double rectangleLength() {
		return length;
	}

}

/*
 * Explicit casting --> Access subclass specific methods or properties
 * Explicit casting --> Superclass reference to subclass
 */
public class BasicOverRiding {
	public static void main(String[] args) {

		// Implicit Upcasting
		Shape shapeCircle = new Circle(5);
		System.out.println("Area of Circle: " + shapeCircle.area());

		// Explicit downcasting of superclass reference to subclass
		Shape shape = new Shape();
		if (shape instanceof Circle) {
			System.out.println("Area of Circle with Explicit OVerriding: " + shapeCircle.area());
		}

		Shape shapeRectangle = new Rectangle(4, 6);
		System.out.println("Area of Rectangle: " + shapeRectangle.area());

		// Explicit DownCasting
		if (shapeRectangle instanceof Shape) {
			Rectangle rectangle = (Rectangle) shapeRectangle;
			System.out.println("Length of Circle by explicit downcasting method: " + rectangle.rectangleLength());
			System.out.println("Length of Circle by explicit downcasting property: " + rectangle.length);
		}

	}
}
