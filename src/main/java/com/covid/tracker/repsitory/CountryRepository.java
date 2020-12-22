package com.covid.tracker.repsitory;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.covid.tracker.model.Country;

@Repository
public interface CountryRepository extends MongoRepository<Country, ObjectId> {
	
	public Country findByName(String name);
	
	@Query(value="{}",sort= "{favourite:-1}")
	public List<Country> findAllOrderByFavourite();
}
