package org.codersparks.edpc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Commodity {

	@Id
	private long id;

	private String name;
	
	private long averagePrice;

	public Commodity() {}
	
	/**
	 * @param id
	 * @param name
	 * @param averagePrice
	 */
	public Commodity(long id, String name, long averagePrice) {
		super();
		this.id = id;
		this.name = name;
		this.averagePrice = averagePrice;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the averagePrice
	 */
	public long getAveragePrice() {
		return averagePrice;
	}

	/**
	 * @param averagePrice the averagePrice to set
	 */
	public void setAveragePrice(long averagePrice) {
		this.averagePrice = averagePrice;
	}
	
	
	
	
}
