package happyness.view;

import java.util.concurrent.ThreadLocalRandom;

import happyness.model.HappyElement;
import happyness.model.PersistentList;

public class Console_Front implements Interface_Front{

	private final String NOENTRY = "Meditiere über ein paar schöne Sätze!";

	
	private PersistentList pl;

	
	public Console_Front() {
		this.pl = PersistentList.getPersistentList();
	}
	
	
	
	@Override	
	public String getEntry() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, pl.size());

		if(pl.size() == 0) {
			return NOENTRY;
		}
		System.out.println(pl.size());
		return pl.getEntry(randomNum).getHappyness_quote();
	}
	@Override
	public void addEntry(String hapy) {	
		this.pl.addEntry(new HappyElement(hapy));
		
	}

	@Override
	public void showEntry() {
		System.out.println(getEntry());
	}



}
