package com.example.onetomany;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> 
{
  @Query("select c from Country c where c.countryname=?1")
  List<Country> getByName(String countryname);
  
}
