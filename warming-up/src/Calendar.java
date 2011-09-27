import java.util.ArrayList;
import java.util.Iterator;

public class Calendar implements Iterator<Event>{
	
	private String name;
	private User owner;
	private ArrayList<Event> events;
	private int i;
	
	public Calendar (String name, User owner){
		this.name = name;
		this.owner = owner;
		this.events = new ArrayList<Event>();
		i = 0;
	}
	
	public String getName(){
		return this.name;
	}
	
	public User getOwner(){
		return this.owner;
	}
	
	public void addEvent(Event ev,User user){
		if(user.equals(this.owner))
			this.events.add(ev);
	}
	
	public boolean removeEvent(Event ev){
		return this.events.remove(ev);
	}
	
	public void setIndexBack(){
		i = 0;
	}

	@Override
	public boolean hasNext() {
		return i<events.size();
	}

	@Override
	public Event next() {
		return events.get(i++);
	}

	@Override
	public void remove() {
		//Not implemented;
	}
}
