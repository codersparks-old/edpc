package org.codersparks.edpc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class System {
	
	@Id
	private long id;
	
	@Column(nullable=false)
	private String name;
	
	private double x;
	private double y;
	private double z;
	
	private String faction;
	private long population;
	private String government;
	private String allegiance;
	private String state;
	private String security;
	private String primary_economy;
	
	/**
	 * Empty constructor for JPA
	 */
	public System() {}
	
	/**
	 * Constructor to initialise the entity
	 * @param id
	 * @param name
	 * @param x
	 * @param y
	 * @param z
	 * @param faction
	 * @param population
	 * @param government
	 * @param allegiance
	 * @param state
	 * @param security
	 * @param primary_economy
	 */
	public System(long id, String name, double x, double y, double z,
			String faction, long population, String government,
			String allegiance, String state, String security,
			String primary_economy) {
		super();
		this.id = id;
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
		this.faction = faction;
		this.population = population;
		this.government = government;
		this.allegiance = allegiance;
		this.state = state;
		this.security = security;
		this.primary_economy = primary_economy;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public String getFaction() {
		return faction;
	}

	public void setFaction(String faction) {
		this.faction = faction;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getGovernment() {
		return government;
	}

	public void setGovernment(String government) {
		this.government = government;
	}

	public String getAllegiance() {
		return allegiance;
	}

	public void setAllegiance(String allegiance) {
		this.allegiance = allegiance;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public String getPrimary_economy() {
		return primary_economy;
	}

	public void setPrimary_economy(String primary_economy) {
		this.primary_economy = primary_economy;
	}
	
	
}
