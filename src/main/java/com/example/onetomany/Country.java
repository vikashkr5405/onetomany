package com.example.onetomany;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="Country")
public class Country {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

int id;
String countryname;

@JsonManagedReference
@OneToMany(cascade=CascadeType.ALL)
List<City> city;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCountryname() {
	return countryname;
}

public void setCountryname(String countryname) {
	this.countryname = countryname;
}

public List<City> getCity() {
	return city;
}

public void setCity(List<City> city) {
	this.city = city;
}

}
