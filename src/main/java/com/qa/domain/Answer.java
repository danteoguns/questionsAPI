package com.qa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String answer;
	private boolean correct;
	
//	List<String> answers;
//	String answerA, answerB, answerC, answerD;

	
	
	
	public Answer (String answer, boolean correct) {
		
		this.answer = answer;
		this.correct = correct;
		
//		answers = new ArrayList<String>();
//		answers.add(answerA);
//		answers.add(answerB);
//		answers.add(answerC);
//		answers.add(answerD);
		
	}
	
	public Answer() {
		
	}
	
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
	public boolean isCorrect() {
		return correct;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	
	
	

}
