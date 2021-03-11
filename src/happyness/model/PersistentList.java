package happyness.model;

import java.util.LinkedList;

public class PersistentList {

	LinkedList<HappyElement> happy_list;
	private PersistentList persistentList= null;
	
	
	private PersistentList() {
		happy_list = new LinkedList<HappyElement>();
	}
	
	public PersistentList getPersistentList() {
		if(this.persistentList == null) {
			this.persistentList = new PersistentList();
		}
		return this.persistentList;
	}
	
	public HappyElement getEntry(int index) {
		return happy_list.get(index);
	}
	public void addEntry(HappyElement happy) {
		this.happy_list.add(happy);
	}
	
	
}
