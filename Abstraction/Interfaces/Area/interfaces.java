interface Interfaces{
	double calculate(double num1, double num2);
}

class Rectangle implements Interfaces{
	public double calculate (double length, double breath){
		return length*breath;
	}
}
class Square implements Interfaces{
	public double calculate(double side, double empty){
		return side*side;
	}
}
class Circle implements Interfaces{
	public double calculate(double radius, double empty){
		return 3.14*radius*radius;
	}
}
class Area{
	public static void main(String args[]){
		Rectangle rectangle = new Rectangle();
		System.out.println("The area of rectangle is: "+rectangle.calculate(5,4));

		Square square = new Square();
		System.out.println("The area of square is: "+square.calculate(5,0));

		Circle circle = new Circle();
		System.out.println("The area of circle is: "+circle.calculate(5,0));
	}
}
