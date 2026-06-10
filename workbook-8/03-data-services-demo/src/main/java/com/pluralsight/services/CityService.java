package com.pluralsight.services;

import com.pluralsight.models.City;

import java.util.List;

public interface CityService {
    List<City> searchById(int id);
	List<City> searchByCountry(String country);
	List<City> searchByState(String sate);

//	List<City> searchById(int id);

}
