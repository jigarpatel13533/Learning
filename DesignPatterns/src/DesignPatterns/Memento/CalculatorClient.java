/**
 * 
 */
package DesignPatterns.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jigar Jarsania
 *
 */
public class CalculatorClient
{
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		CareTaker ct = new CareTaker();

		calc.addition(5, 5);
		System.out.println("Display : "+calc.getCurrent());
		ct.add(calc.saveMemento());
		calc.addition(5, 25);
		calc.division(25, 5);
		System.out.println("Display : "+calc.getCurrent());
		ct.add(calc.saveMemento());
		
		calc.restoreFromMemento(ct.get(0));
		System.out.println("Display : "+calc.getCurrent());
		calc.restoreFromMemento(ct.get(1));
		System.out.println("Display : "+calc.getCurrent());
	}
}

class Calculator
{
	private int value = 0;
	
	public int getCurrent()
	{
		return value;
	}
	public void setCurrent(int value)
	{
		this.value = value;
	}
	
	public Memento saveMemento()
	{
		System.out.println(value+" saved in Memento");
		return new Memento(value);
	}
	public void restoreFromMemento(Memento m)
	{
		value = m.getValue();
		System.out.println(value+" restored from Memento");
	}
	
	public int addition(int a, int b)
	{
		value = a+b;
		return value;
	}
	public int multiplication(int a, int b)
	{
		value = a*b;
		return value;
	}
	public int substraction(int a, int b)
	{
		value = a-b;
		return value;
	}
	public int division(int a, int b)
	{
		value = a/b;
		return value;
	}
}

class Memento
{
	private final int value;
	public Memento(int value)
	{
		this.value = value;
	}
	public int getValue()
	{
		return value;
	}
}

class CareTaker
{
	private List<Memento> savedList = new ArrayList<Memento>();
	public void add(Memento m)
	{
		savedList.add(m);
	}
	public Memento get(int index)
	{
		return savedList.get(index);
	}
}

/**
 * @author Jigar Jarsania
 *
 *
 */