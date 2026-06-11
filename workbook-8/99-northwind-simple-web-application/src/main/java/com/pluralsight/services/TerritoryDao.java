package com.pluralsight.services;

import com.pluralsight.models.Territory;

import java.util.ArrayList;

public interface TerritoryDao {
	ArrayList<Territory> getTerritories();

	Territory getTerritory(int TerritoryId);

	void addTerritory(Territory territory);

	void updateTerritory(Territory territory);

	void deleteTerritory(int territoryId);
}
