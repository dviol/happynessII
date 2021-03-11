package happyness.model;

import java.util.LinkedList;

public class PersistentList {

	LinkedList<HappyElement> happy_list;
	private static PersistentList persistentList= null;
	
	
	private PersistentList() {
		happy_list = new LinkedList<HappyElement>();
	}
	
	public static PersistentList getPersistentList() {
		if(persistentList == null) {
			persistentList = new PersistentList();
		}
		return persistentList;
	}
	
	public HappyElement getEntry(int index) {
		return happy_list.get(index);
	}
	public void addEntry(HappyElement happy) {
		this.happy_list.add(happy);
	}
	public int size() {
		return persistentList.size();
	}
	
}
