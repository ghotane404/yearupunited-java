package com.pluralsight.models;

public class Region {
	private int regionId;
	private String regionDescription;

	public Region(int regionId, String regionDescription) {
		this.regionId = regionId;
		this.regionDescription = regionDescription;
	}

	public Region() {

	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getRegionDescription() {
		return regionDescription;
	}

	public void setRegionDescription(String regionDescription) {
		this.regionDescription = regionDescription;
	}
	
}
