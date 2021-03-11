package happyness.view;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import happyness.model.HappyElement;
import happyness.model.PersistentList;

public class Console_Front implements Interface_Front{

	private PersistentList pl;
	private final String PROMPT = "Moin! Was möchtest du mir sagen?";
	private final String THANKS = "Dankö!";
	
	public Console_Front(PersistentList pl) {
		this.pl = pl;
	}
	
	@Override	
	public String getEntry() {
		Random r = new Random(LocalDate.now().hashCode());
		
		return pl.getEntry(r.nextInt(pl.size())).getHappyness_quote();
	}
	@Override
	public void addEntry(String input) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(PROMPT);
		this.pl.addEntry(new HappyElement(sc.next()));
		System.out.println(THANKS);
		sc.close();
	}



}
