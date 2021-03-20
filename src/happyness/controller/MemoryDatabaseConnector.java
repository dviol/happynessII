/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happyness.controller;

import happyness.model.HappyElement;
import happyness.model.PersistentList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Dede
 */
public class MemoryDatabaseConnector implements IDatabaseConnector {
        private final String NOENTRY = "Meditiere über ein paar schöne Sätze!";
	private PersistentList pl;
        private static MemoryDatabaseConnector MDC;

	
	private MemoryDatabaseConnector() {
		this.pl = PersistentList.getPersistentList();
	}
        
        public static MemoryDatabaseConnector getDC(){
            if(MDC == null){
                MDC = new MemoryDatabaseConnector();
            }
            return MDC;
        }
    
    
    @Override
    public String getEntry(int index) {
		int randomNum = ThreadLocalRandom.current().nextInt(0, pl.size());

		if(pl.size() == 0) {
			return NOENTRY;
		}
		return pl.getEntry(randomNum).getHappyness_quote();
    }

    @Override
    public void addEntry(String input) {
       this.pl.addEntry(new HappyElement(input));
    }

    @Override
    public int size() {
       return pl.size();
    }
    
}
