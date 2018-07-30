package com.qa.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.domain.MultipleChoice;
import com.qa.utility.JSONUtility;

@Service
public class MultipleChoiceService implements IMultipleChoice {

	@Autowired
	private MultipleChoice dictionary;
	
	private HashMap<String, String[]> questions;

	private JSONUtility util;

	@Override
	public HashMap<String, String[]> questionSet() {
		int counter = 0;
		while (counter < dictionary.fileSize()) {
			dictionary.getQuestions();
			dictionary.getAnswers();
		}
		return questions;
	}



}
