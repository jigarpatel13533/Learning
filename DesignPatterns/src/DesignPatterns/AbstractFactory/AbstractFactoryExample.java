/**
 * 
 */
package DesignPatterns.AbstractFactory;

/**
 * @author Jigar Jarsania
 *
 *Reference : https://www.geeksforgeeks.org/abstract-factory-pattern/
 *
 */
public class AbstractFactoryExample
{
	public static void main(String[] args)
	{
		Car miniCar = CarFactory.buildCar(CarType.MINI, Location.INDIA);
		System.out.println(miniCar.toString());
		
		Car luxuryCar = CarFactory.buildCar(CarType.LUXURY, Location.USA);
		System.out.println(luxuryCar.toString());
	}
}

enum CarType
{
	MICRO, MINI, LUXURY
}

enum Location
{
	DEFAULT, USA, INDIA
}
/**
 * @author Jigar Jarsania
 *
 *
 */