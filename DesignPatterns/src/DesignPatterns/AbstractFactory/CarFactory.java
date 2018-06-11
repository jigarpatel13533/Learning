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
public class CarFactory
{
	private CarFactory()
	{};
	
	public static Car buildCar(CarType model, Location location)
	{
		Car car = null;
		
		switch(location)
		{
			case USA:
				car = USACarFactory.buildCar(model);
				break;
			case INDIA:
				car = INDIACarFactory.buildCar(model);
				break;
			case DEFAULT:
				car = DEFAULTCarFactory.buildCar(model);
				break;
		}
		return car;
	}
}

class INDIACarFactory
{
	static Car buildCar(CarType model)
	{
		Car car = null;
		switch(model)
		{
			case MICRO:
				car = new MicroCar(Location.INDIA);
				break;
			case MINI:
				car = new MiniCar(Location.INDIA);
				break;
			case LUXURY:
				car = new LuxuryCar(Location.INDIA);
			default:
				break;
		}
		return car;
	}
}

class USACarFactory
{
	static Car buildCar(CarType model)
	{
		Car car = null;
		switch(model)
		{
			case MICRO:
				car = new MicroCar(Location.USA);
				break;
			case MINI:
				car = new MiniCar(Location.USA);
				break;
			case LUXURY:
				car = new LuxuryCar(Location.USA);
			default:
				break;
		}
		return car;
	}
}

class DEFAULTCarFactory
{
	static Car buildCar(CarType model)
	{
		Car car = null;
		switch(model)
		{
			case MICRO:
				car = new MicroCar(Location.DEFAULT);
				break;
			case MINI:
				car = new MiniCar(Location.DEFAULT);
				break;
			case LUXURY:
				car = new LuxuryCar(Location.DEFAULT);
			default:
				break;
		}
		return car;
	}
}

/**
 * @author Jigar Jarsania
 *
 *
 */