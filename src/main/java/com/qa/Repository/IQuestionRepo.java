package com.qa.Repository;

public interface IQuestionRepo {
	
	String showQuestion(Long id);

	String chooseAnswer(Long id);
	
	String getAllQuestions();

}
