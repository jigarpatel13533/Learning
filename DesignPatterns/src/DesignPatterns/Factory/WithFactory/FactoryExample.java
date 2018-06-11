/**
 * 
 */
package DesignPatterns.Factory.WithFactory;

/**
 * @author Jigar Jarsania
 * 
 * Reference : https://www.geeksforgeeks.org/design-patterns-set-2-factory-method/
 * 
 */
public class FactoryExample {

	public static void main(String[] args) {
		Client client1 = new Client("Square");
		Drawing drawing1 = client1.getDrawing();
		drawing1.whoAmI();
		
		Client client2 = new Client("Circle");
		Drawing drawing2 = client2.getDrawing();
		drawing2.whoAmI();
	}
}

//Client Class
class Client
{
	private Drawing drawing;
	Client(String type)
	{
		drawing = DrawingFactory.createDrawing(type);
	}
	
	Drawing getDrawing()
	{
		return drawing;
	}
}

//Factory Class
class DrawingFactory
{
	static Drawing createDrawing(String type)
	{
		if("Square".equals(type))
		{
			return new Square();
		}
		else if("Rectangle".equals(type))
		{
			return new Rectangle();
		}
		else if("Circle".equals(type))
		{
			return new Circle();
		}
		else
		{
			return null;
		}
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