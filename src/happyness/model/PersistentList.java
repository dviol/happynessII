package happyness.model;

import java.util.LinkedList;

import happyness.controller.MainController;

public class PersistentList {

	LinkedList<HappyElement> happy_list;
	private static PersistentList persistentList= null;
	
	
	private PersistentList() {
		happy_list = new LinkedList<HappyElement>();
		if(MainController.DEBUG) {
			happy_list.add(new HappyElement("0 Ich liebe dich!"));
			happy_list.add(new HappyElement("1 Ich dich auch!"));
			happy_list.add(new HappyElement("2 Du bist so toll!"));
			
		}
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
		return happy_list.size();
	}
	
}
