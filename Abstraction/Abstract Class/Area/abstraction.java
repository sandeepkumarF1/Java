abstract class Shape{
	abstract void getInfo(String name);
	abstract void areaInfo(int no1, int no2);
}
class Rectangle extends Shape{
	void getInfo(String name){
		System.out.println(name);
	}
	void areaInfo(int length, int breath){
		System.out.println(length*breath);
	}
}
class Square extends Shape{
	void getInfo(String name){
		System.out.println(name);
	}
	void areaInfo(int side, int empty){
		System.out.println(side*side);
	}
}
class Circle extends Shape{
	void getInfo(String name){
		System.out.println(name);
	}
	void areaInfo(int radius, int empty){
		System.out.println(3.14*radius*radius);
	}
}
class run{
	public static void main(String args[]){
		Rectangle rectangle = new Rectangle();
		rectangle.getInfo("Rectangle");
		rectangle.areaInfo(5,5);

		Square square = new Square();
		square.getInfo("Square");
		square.areaInfo(5,0);

		Circle circle = new Circle();
		circle.getInfo("Circle");
		circle.areaInfo(5,0);
	}
}
