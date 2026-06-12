package com.pluralsight.services;

import com.pluralsight.models.Territory;

import java.util.ArrayList;

public interface TerritoryDao {
	ArrayList<Territory> getTerritoriesByRegion(int searchRegionId);

//	ArrayList<Territory> getTerritories();

	Territory getTerritory(int territoryId);

	void addTerritory(Territory territory);

	void updateTerritory(Territory territory);

	void deleteTerritory(int territoryId);
}
