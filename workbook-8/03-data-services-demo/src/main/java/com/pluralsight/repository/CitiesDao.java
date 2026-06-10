package com.pluralsight.repository;

import com.pluralsight.models.City;

import java.util.List;

public interface CitiesDao
{

    List<City> getCityById(int id);
    List<City> getCitiesByCountry(String country);
    List<City> getCitiesByState(String state);
}
