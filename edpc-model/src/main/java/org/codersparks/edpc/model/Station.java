package org.codersparks.edpc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Station {
	
	public enum LandingPadSize {
		SMALL,
		MEDIUM,
		LARGE
	}
	
	@Id
	private long id;
	
	@ManyToOne
	@JoinColumn(name="SystemId", nullable=false)
	private System system;
	
	private LandingPadSize maxLandingPadSize;
	
	private long starDistance;
	
	private String faction;
	
	private String government;
	
	private String allegiance;
	
	private String state;
	
	private String type;
	
	private boolean hasBlackMarket;
	
	private boolean hasCommodities;
	
	private boolean hasRefuel;
	
	private boolean hasRepair;
	
	private boolean hasRearm;
	
	private boolean hasOutfitting;
	
	private boolean hasShipyard;
	

	
	/**
	 * Empty constructor for JPA
	 */
	public Station() {}

	/**
	 * @param id
	 * @param system
	 * @param maxLandingPadSize
	 * @param starDistance
	 * @param faction
	 * @param government
	 * @param allegiance
	 * @param state
	 * @param type
	 * @param hasBlackMarket
	 * @param hasCommodities
	 * @param hasRefuel
	 * @param hasRepair
	 * @param hasRearm
	 * @param hasOutfitting
	 * @param hasShipyard
	 * @param exportCommodities
	 * @param importCommodities
	 * @param prohibitedCommodities
	 */
	public Station(long id, System system, LandingPadSize maxLandingPadSize,
			long starDistance, String faction, String government,
			String allegiance, String state, String type,
			boolean hasBlackMarket, boolean hasCommodities, boolean hasRefuel,
			boolean hasRepair, boolean hasRearm, boolean hasOutfitting,
			boolean hasShipyard) {
		super();
		this.id = id;
		this.system = system;
		this.maxLandingPadSize = maxLandingPadSize;
		this.starDistance = starDistance;
		this.faction = faction;
		this.government = government;
		this.allegiance = allegiance;
		this.state = state;
		this.type = type;
		this.hasBlackMarket = hasBlackMarket;
		this.hasCommodities = hasCommodities;
		this.hasRefuel = hasRefuel;
		this.hasRepair = hasRepair;
		this.hasRearm = hasRearm;
		this.hasOutfitting = hasOutfitting;
		this.hasShipyard = hasShipyard;
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
	 * @return the system
	 */
	public System getSystem() {
		return system;
	}

	/**
	 * @param system the system to set
	 */
	public void setSystem(System system) {
		this.system = system;
	}

	/**
	 * @return the maxLandingPadSize
	 */
	public LandingPadSize getMaxLandingPadSize() {
		return maxLandingPadSize;
	}

	/**
	 * @param maxLandingPadSize the maxLandingPadSize to set
	 */
	public void setMaxLandingPadSize(LandingPadSize maxLandingPadSize) {
		this.maxLandingPadSize = maxLandingPadSize;
	}

	/**
	 * @return the starDistance
	 */
	public long getStarDistance() {
		return starDistance;
	}

	/**
	 * @param starDistance the starDistance to set
	 */
	public void setStarDistance(long starDistance) {
		this.starDistance = starDistance;
	}

	/**
	 * @return the faction
	 */
	public String getFaction() {
		return faction;
	}

	/**
	 * @param faction the faction to set
	 */
	public void setFaction(String faction) {
		this.faction = faction;
	}

	/**
	 * @return the government
	 */
	public String getGovernment() {
		return government;
	}

	/**
	 * @param government the government to set
	 */
	public void setGovernment(String government) {
		this.government = government;
	}

	/**
	 * @return the allegiance
	 */
	public String getAllegiance() {
		return allegiance;
	}

	/**
	 * @param allegiance the allegiance to set
	 */
	public void setAllegiance(String allegiance) {
		this.allegiance = allegiance;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the hasBlackMarket
	 */
	public boolean isHasBlackMarket() {
		return hasBlackMarket;
	}

	/**
	 * @param hasBlackMarket the hasBlackMarket to set
	 */
	public void setHasBlackMarket(boolean hasBlackMarket) {
		this.hasBlackMarket = hasBlackMarket;
	}

	/**
	 * @return the hasCommodities
	 */
	public boolean isHasCommodities() {
		return hasCommodities;
	}

	/**
	 * @param hasCommodities the hasCommodities to set
	 */
	public void setHasCommodities(boolean hasCommodities) {
		this.hasCommodities = hasCommodities;
	}

	/**
	 * @return the hasRefuel
	 */
	public boolean isHasRefuel() {
		return hasRefuel;
	}

	/**
	 * @param hasRefuel the hasRefuel to set
	 */
	public void setHasRefuel(boolean hasRefuel) {
		this.hasRefuel = hasRefuel;
	}

	/**
	 * @return the hasRepair
	 */
	public boolean isHasRepair() {
		return hasRepair;
	}

	/**
	 * @param hasRepair the hasRepair to set
	 */
	public void setHasRepair(boolean hasRepair) {
		this.hasRepair = hasRepair;
	}

	/**
	 * @return the hasRearm
	 */
	public boolean isHasRearm() {
		return hasRearm;
	}

	/**
	 * @param hasRearm the hasRearm to set
	 */
	public void setHasRearm(boolean hasRearm) {
		this.hasRearm = hasRearm;
	}

	/**
	 * @return the hasOutfitting
	 */
	public boolean isHasOutfitting() {
		return hasOutfitting;
	}

	/**
	 * @param hasOutfitting the hasOutfitting to set
	 */
	public void setHasOutfitting(boolean hasOutfitting) {
		this.hasOutfitting = hasOutfitting;
	}

	/**
	 * @return the hasShipyard
	 */
	public boolean isHasShipyard() {
		return hasShipyard;
	}

	/**
	 * @param hasShipyard the hasShipyard to set
	 */
	public void setHasShipyard(boolean hasShipyard) {
		this.hasShipyard = hasShipyard;
	}
	
}
