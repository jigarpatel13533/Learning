/**
 * 
 */
package DesignPatterns.Factory.WithoutFactory;

/**
 * @author Jigar Jarsania
 * 
 * Reference : https://www.geeksforgeeks.org/design-patterns-set-2-factory-method/
 * 
 */
public class NonFactoryExample {

	public static void main(String[] args) {
		Client client = new Client("Rectangle");
		Drawing drawing = client.getDrawing();
		drawing.whoAmI();
	}
}

//Client Class
class Client
{
	private Drawing drawing;
	Client(String type)
	{
		if("Square".equals(type))
		{
			drawing = new Square();
		}
		else if("Rectangle".equals(type))
		{
			drawing = new Rectangle();
		}
		else if("Circle".equals(type))
		{
			drawing = new Circle();
		}
	}
	
	Drawing getDrawing()
	{
		return drawing;
	}
}


//Library Classes
abstract class Drawing
{
	abstract void whoAmI();
}
class Square extends Drawing
{
	@Override
	void whoAmI() {
		System.out.println("I am Square");
	}
}
class Rectangle extends Drawing
{
	@Override
	void whoAmI() {
		System.out.println("I am Rectangle");
	}
}
class Circle extends Drawing
{
	@Override
	void whoAmI() {
		System.out.println("I am Circle");
	}
}
/**
 * @author Jigar Jarsania
 *
 *
 */