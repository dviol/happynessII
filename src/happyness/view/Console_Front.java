package happyness.view;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import happyness.model.HappyElement;
import happyness.model.PersistentList;

public class Console_Front implements Interface_Front{

	private PersistentList pl;
	private final String PROMPT = "Moin! Was möchtest du mir sagen?";
	private final String THANKS = "Dankö!";
	private final String NOENTRY = "Meditiere über ein paar schöne Sätze!";
	
	public Console_Front() {
		this.pl = PersistentList.getPersistentList();
	}
	
	
	
	@Override	
	public String getEntry() {
		Random r = new Random(LocalDate.now().hashCode());
		if(pl.size() == 0) {
			return NOENTRY;
		}
		return pl.getEntry(r.nextInt(pl.size())).getHappyness_quote();
	}
	@Override
	public void addEntry() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(PROMPT);
		this.pl.addEntry(new HappyElement(sc.next()));
		System.out.println(THANKS);
		sc.close();
	}

	@Override
	public void showEntry() {
		System.out.println(getEntry());
	}



}
