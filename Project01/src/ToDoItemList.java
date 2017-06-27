import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * ArrayList todoItemList
 * @author User
 *
 */
public class ToDoItemList {
	
	public static void main(String[] args, Date timeStamp){

	ArrayList<String> toDoItemList = new ArrayList<String>();
	
	toDoItemList.add("wash cloth");
	toDoItemList.add("homework");
	boolean result = toDoItemList.add("cooking");
	
	System.out.println(result);
	toDoItemList.add("clean the house");
	toDoItemList.add("beak");
	
	System.out.println(toDoItemList.size());
	
	toDoItemList.remove(1);
	toDoItemList.add("added todo");
	toDoItemList.add(1, "six todo");
	
	for(int i = 0; i < toDoItemList.size(); i++) {
		System.out.println(toDoItemList.get(i));
	}
	
//	public ToDoItem(null, result, null) {
//		this.item = item;
//		timeStamp = new Date();
//	}
	HashMap<String, ToDoItem> toDoItemHashMap = new HashMap<String, ToDoItem>();
	

	
	
	
	}
}
