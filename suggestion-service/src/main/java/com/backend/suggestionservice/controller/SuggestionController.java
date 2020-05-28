package com.backend.suggestionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.suggestionservice.model.Suggestion;
import com.backend.suggestionservice.repository.SuggestionRepository;

@RestController
@RequestMapping("/suggestion")
@CrossOrigin
public class SuggestionController {
	
	@Autowired
	private SuggestionRepository suggestionRepository;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Suggestion save(@RequestBody Suggestion suggestion) {
		Suggestion response  = this.suggestionRepository.save(suggestion);
		System.out.println("Response ---------> " + response);
		return response;
	}
	
	@RequestMapping(value = "/fetch", method = RequestMethod.GET)
	public List<Suggestion> fetch() {
		List<Suggestion> response  = this.suggestionRepository.findAll();
		System.out.println("Response ---------> " + response);
		return response;
	}

}
