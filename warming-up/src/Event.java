import java.util.Date;

public class Event {
	
	private Date start, end;
	private String name;
	private boolean pub;
	private User user;
	
	public Event(Date start,Date end,String name, boolean pub, User user){
		this.start = start;
		this.end = end;
		this.name = name;
		this.pub = pub;
		this.user = user;
	}
	
	public Date getStart(){
		return this.start;
	}
	
	public Date getEnd(){
		return this.end;
	}
	
	public String getName(){
		return this.name;
	}
	
	public boolean visibleFor(User user){
		if(pub)
			return true;
		else
			return user.equals(this.user);
	}
	
	public String toString(){
		return "Event "+name+" from "+start+" to "+end+", by "+user.getName();
	}
}
