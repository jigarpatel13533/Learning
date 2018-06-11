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
public abstract class Car
{
	CarType model;
	Location location;
	
	abstract void construct();
	
	Car(CarType type, Location location)
	{
		this.model = type;
		this.location = location;
	}

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString()
	{
		return "CarModel - "+model + " located in "+location;
	}
}

class LuxuryCar extends Car
{
    LuxuryCar(Location location)
    {
        super(CarType.LUXURY, location);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("Building Luxury car");
    }
}
 
class MicroCar extends Car
{
    MicroCar(Location location)
    {
        super(CarType.MICRO, location);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("Building Micro Car ");
    }
}
 
class MiniCar extends Car
{
    MiniCar(Location location)
    {
        super(CarType.MINI,location );
        construct();
    }
     
    @Override
    void construct()
    {
        System.out.println("Building Mini car");
    }
}
 

/**
 * @author Jigar Jarsania
 *
 *
 */