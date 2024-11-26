package overriding;

/*
 * Method Overriding with Return Type and Parameters
 * Auto widening and autoboxing doesn't work in Over riding mechanism
*/

class Shape {

	//overriden method
	double area() {
		System.out.println("In area method of Shape");
		return 0.0;
	}

}

class Circle extends Shape {

	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	//over riding method
	@Override
	double area() {
		System.out.println("In area method of Circle");
		return Math.PI * radius * radius;
	}
	
	double areaTest() {
		System.out.println("In area method of Circle");
		return Math.PI * radius * radius;
	}

}


class Rectangle extends Shape {

	double length, width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	//over riding method
	@Override
	double area() {
		System.out.println("In area method of Rectangle");
		return length * width;
	}

	double rectangleLength() {
		System.out.println("In rectangleLength method of Rectangle");
		return length;
	}

}

/*
 * Explicit casting --> Access subclass specific methods or properties
 * Explicit casting --> Superclass reference to subclass
 */

public class OverRiding {
	public static void main(String[] args) {

		// Implicit Upcasting,  object is created for subclass and object is referred  (object reference) to super class
		Shape shapeCircle = new Circle(5);
		
		//Object is invoked after validating the references
		System.out.println("Area of Circle: " + shapeCircle.area());
	//	System.out.println("Area of Circle: " + shapeCircle.areaTest());

		// Explicit downcasting of superclass reference to subclass
		Shape shape = new Shape();
		System.out.println("shape is Instance of Circle "+(shape instanceof Circle));
		if (shape instanceof Circle) {
			System.out.println("Area of Circle with Explicit OVerriding: " + shape.area());
		}

		//cannot create object reference like this
		/* 
		Circle circleShape = (Circle) new Shape();	
		System.out.println(circleShape.area());
		*/
		
		Shape shapeRectangle = new Rectangle(4, 6);
		System.out.println("Area of Rectangle: " + shapeRectangle.area());

		// Explicit DownCasting
		if (shapeRectangle instanceof Shape) {
			//Object reference is update to subclass
			Rectangle rectangle = (Rectangle) shapeRectangle;
			System.out.println("Length of Circle by explicit downcasting method: " + rectangle.rectangleLength());
			System.out.println("Length of Circle by explicit downcasting property: " + rectangle.length);
		}

	}
}
