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
public class HelpDeskImplementator
{
	public static void main(String[] args)
	{
		HelpDeskCareTaker ct = new HelpDeskCareTaker();

		ContactPerson cp1 = new ContactPerson("abc", 1111111);
		
		HelpDesk hd = new HelpDesk(cp1);
		
		System.out.println("Receptionist : "+hd.getName());
		ct.add(hd.saveMemento());
		
		hd.addReceptionist(new ContactPerson("def", 2222222));
		ct.add(hd.saveMemento());
		System.out.println("Receptionist : "+hd.getName());
		
		hd.addReceptionist(new ContactPerson("xyz", 3333333));
		ct.add(hd.saveMemento());
		System.out.println("Receptionist : "+hd.getName());
		
		
		hd.restoreFromMemento(ct.get(0));
		System.out.println("Receptionist : "+hd.getName());
	}
}

class ContactPerson
{
	private String name;
	private int number;
	
	ContactPerson(String name, int number)
	{
		this.name = name;
		this.number = number;		
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}
}

class HelpDesk
{
	private ContactPerson current;
	
	HelpDesk(ContactPerson cp)
	{
		this.current = cp;
	}
	
	public void addReceptionist(ContactPerson cp)
	{
		this.current = cp;
	}
	
	public String getName()
	{
		return current.getName();
	}
	public int getNumber()
	{
		return current.getNumber();
	}
	
	public HelpDeskMemento saveMemento()
	{
		System.out.println(this.current.getName()+" saved in Memento");
		return new HelpDeskMemento(this.current);
	}
	public void restoreFromMemento(HelpDeskMemento m)
	{
		this.current = m.get();
		System.out.println(this.current.getName() +" restored from Memento");
	}
}

class HelpDeskMemento
{
	private final ContactPerson cp;
	public HelpDeskMemento(ContactPerson cp)
	{
		this.cp = cp;
	}
	public ContactPerson get()
	{
		return cp;
	}
}

class HelpDeskCareTaker
{
	private List<HelpDeskMemento> savedList = new ArrayList<HelpDeskMemento>();
	public void add(HelpDeskMemento m)
	{
		savedList.add(m);
	}
	public HelpDeskMemento get(int index)
	{
		return savedList.get(index);
	}
}

/**
 * @author Jigar Jarsania
 *
 *
 */