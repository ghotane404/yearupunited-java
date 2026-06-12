package com.pluralsight.services;

import com.pluralsight.models.Region;

import java.util.ArrayList;

public interface RegionDao {
	ArrayList<Region> getRegions();

	Region getRegion(int regionId);

	void addRegion(Region region);

	void updateRegion(Region region);

	void deleteRegion(int regionId);
}
