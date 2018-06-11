package DesignPatterns.Memento;

/**
 * @author Jigar Jarsania
 *
 */

import java.util.List;
import java.util.ArrayList;
 
class Life
{
    private String time;
  
    public void set(String time) 
    {
        System.out.println("Setting time to " + time);
        this.time = time;
    }
    
    public String get()
    {
    	return time;
    }
  
    public Memento saveToMemento() 
    {
        System.out.println("Saving time to Memento");
        return new Memento(time);
    }
  
    public void restoreFromMemento(Memento memento) 
    {
        time = memento.getSavedTime();
        System.out.println("Time restored from Memento: " + time);
    }
  
    public static class Memento 
    {
        private final String time;
  
        public Memento(String timeToSave) 
        {
            time = timeToSave;
        }
  
        public String getSavedTime() 
        {
            return time;
        }
    }
}
 
public class Design 
{
     
    public static void main(String[] args) 
    {
    	CT caretaker = new CT();
        Life life = new Life();
        //time travel and record the eras
        life.set("1000 B.C.");
        caretaker.add(life.saveToMemento());
        life.set("1000 A.D.");
        caretaker.add(life.saveToMemento());
        life.set("2000 A.D.");
        caretaker.add(life.saveToMemento());
        life.set("4000 A.D.");
        
        System.out.println("-------------------------------");
        System.out.println("Current time : "+life.get());
        life.restoreFromMemento(caretaker.getLast());
        System.out.println("Current time : "+life.get());
        /*life.restoreFromMemento(caretaker.getLast());
        System.out.println("Current time : "+life.get());*/
        
        //life.restoreFromMemento(caretaker.get(0));
        //life.restoreFromMemento(caretaker.get(0));
        //life.restoreFromMemento(caretaker.get(0));
    }
}

class CT
{
	private List<Life.Memento> savedTimes = new ArrayList<Life.Memento>();
	
	public void add(Life.Memento memento)
	{
		savedTimes.add(memento);
	}
	
	public Life.Memento get(int i)
	{
		return savedTimes.get(i);
	}
	
	public Life.Memento getLast()
	{
		return savedTimes.get(savedTimes.size()-1);
	}
}
/**
 * @author Jigar Jarsania
 *
 *
 */