package com.qa.service;

import javax.inject.Inject;

import com.qa.Repository.IQuestionRepo;

public class QuestionService implements IQuestionService {

	@Inject
	private IQuestionRepo repo;

	public String getAllQuestions() {
		return repo.getAllQuestions();
	}

}
