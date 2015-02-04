package entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity

public class Product implements Serializable {

	
	private String Name;
	private String Description;
	private float Price;
	private static final long serialVersionUID = 1L;

	public Product() {
		super();
	}   
	@Id
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}   
	public float getPrice() {
		return this.Price;
	}

	public void setPrice(float Price) {
		this.Price = Price;
	}
   
}
