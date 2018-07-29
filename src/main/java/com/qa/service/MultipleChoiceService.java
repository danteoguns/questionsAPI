package com.qa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.domain.MultipleChoice;
import com.qa.utility.JSONUtility;

@Service
public class MultipleChoiceService implements IMultipleChoice {

	@Autowired
	private MultipleChoice dictionary;

	private JSONUtility util;

	@Override
	public String getDefinition(String key) {
		return dictionary.getDefinition(key);
	}

	@Override
	public String getAllDefinitions() {
		return dictionary.getAllDefinitions().toString();
	}



}
