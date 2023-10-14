package com.example.onetomany;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
@Autowired
CountryRepository crepo;

@Autowired
CityRepository krepo;
 
@RequestMapping("/saved")
public String saved()
{
	Country c=new Country();
	
	City ct=new City();
	ct.setCityname("washington dc");
	City ct1=new City();
	ct1.setCityname("new york");
	City ct2=new City();
	ct2.setCityname("houston");
	City ct3=new City();
	ct3.setCityname("phoenix");
	
	List<City> list=Arrays.asList(ct,ct1,ct3);
	c.setCountryname("usa");
	c.setCity(list);
	ct.setCountry(c); ct1.setCountry(c);ct2.setCountry(c);ct3.setCountry(c);
	 
	crepo.save(c);
	return "data is saved";
}
@RequestMapping("/findall")
public List<Country> findall()
{
	return crepo.findAll();
}
@RequestMapping("/all")
public List<City> all()
{
	return krepo.findAll();
}
@RequestMapping("/by/{id}")
public List<City> ak(@PathVariable int id)
{
	return krepo.findById(id);
}
@RequestMapping("/to/{countryname}")
public List<Country> sd(@PathVariable String countryname)
{
	return crepo.getByName(countryname);
}
}
