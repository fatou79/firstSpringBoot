package com.fatou.Survey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatou.Survey.model.Survey;
import com.fatou.Survey.service.SurveyService;

@RestController
public class SurveyController {
	
	@Autowired
	private SurveyService fatou;
	
	
	@GetMapping("/surveys")
	public List<Survey> retrieveAllSurvey(){
		return fatou.retrieveAllSurveys();
	}

}
