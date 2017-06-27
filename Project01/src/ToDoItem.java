import java.util.Date;

/**
 * String item;
 * boolean done;
 * Date itemStamp;
 * @author User
 *
 */
public class ToDoItem {

	public String item;
	public boolean done;
	public Date timeStamp;
	
	
	// Constructor
	public ToDoItem(String item, boolean done, Date timeStamp) {
		super();
		this.item = item;
		this.done = done;
		this.timeStamp = timeStamp;
	}
	
	
	// Getter & Setter
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
}
