package happyness.model;

import javax.persistence.*;
import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;
import org.hibernate.search.annotations.Store;

@Entity
@Indexed
public class HappyElement {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	private String happyness_quote;
	
	public HappyElement(String quote) {
		this.happyness_quote = quote;
	}s

	public String getHappyness_quote() {
		return happyness_quote;
	}
	
	
	
}
