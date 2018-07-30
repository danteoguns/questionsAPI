package com.qa.service;

public interface IQuestionService {
	
	String showQuestion(Long id);

	String chooseAnswer(Long id);
	
	String getAllQuestions();

}
