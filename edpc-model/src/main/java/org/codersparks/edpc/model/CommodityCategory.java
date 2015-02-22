package org.codersparks.edpc.model;

import javax.persistence.Id;

public class CommodityCategory {

	@Id
	private long id;
	
	private String name;
	
	/**
	 * Constructor for JPA
	 */
	public CommodityCategory() {}

	/**
	 * @param id
	 * @param name
	 */
	public CommodityCategory(long id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
}
