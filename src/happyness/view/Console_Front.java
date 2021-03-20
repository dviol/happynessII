package happyness.view;

import happyness.controller.IDatabaseConnector;
import happyness.controller.MemoryDatabaseConnector;
import java.util.concurrent.ThreadLocalRandom;

import happyness.model.HappyElement;
import happyness.model.PersistentList;

public class Console_Front implements Interface_Front{

	private final String NOENTRY = "Meditiere über ein paar schöne Sätze!";
	
	private IDatabaseConnector idc;

	
	public Console_Front() {
		this.idc = MemoryDatabaseConnector.getDC();
	}
	
	
	
	@Override	
	public String getEntry() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, idc.size());

		if(idc.size() == 0) {
			return NOENTRY;
		}
		return idc.getEntry(randomNum);
	}
	@Override
	public void addEntry(String hapy) {	
		this.idc.addEntry(hapy);
		
	}

	@Override
	public void showEntry() {
		System.out.println(getEntry());
	}



}
