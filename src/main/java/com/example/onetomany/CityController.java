package com.example.onetomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController 
{
@Autowired 
CityRepository crepo;

@RequestMapping("/findit")
public List<City> all()
{
	return crepo.findAll();
}
}
