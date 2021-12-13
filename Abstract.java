package Module1;
abstract class Shape
{
	abstract void shape();
}
class Rectangle extends Shape
{
	void shape() {
		System.out.println("I am rectangle , I have 4 sides");
	}
}
class Triangle extends Shape{
	void shape()
	{
		System.out.println("I am triangle ,I have 3 sides ");
	}
}
class Hexagon extends Shape 
{
	void shape()
	{
		System.out.println("I am hexagon ,I have 6 sides");
	}
}



public class Abstract {
	public static void main(String[] args) {
		Rectangle ob = new Rectangle();
		ob.shape();
		Triangle ob1 = new Triangle();
		ob1.shape();
		Hexagon ob2 = new Hexagon();
		ob2.shape();
		
		
	}

}
