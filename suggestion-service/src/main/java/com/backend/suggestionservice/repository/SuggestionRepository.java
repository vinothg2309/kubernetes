package com.backend.suggestionservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.backend.suggestionservice.model.Suggestion;

@Repository
public interface SuggestionRepository extends MongoRepository<Suggestion, Integer>{

}
