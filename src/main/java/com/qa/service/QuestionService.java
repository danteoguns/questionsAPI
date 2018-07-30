package com.qa.service;

import javax.inject.Inject;

import com.qa.Repository.IQuestionRepo;

public class QuestionService implements IQuestionService{

	@Inject
	private IQuestionRepo repo;
	
	public String showQuestion(Long id) {
		return repo.showQuestion(id);
	}

	public String chooseAnswer(Long id) {
		return repo.chooseAnswer(id);
	}

	public String getAllQuestions() {
		return repo.getAllQuestions();
	}

}
