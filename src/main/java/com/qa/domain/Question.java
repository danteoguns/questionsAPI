package com.qa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(length = 100)
	private String question;

	@Column(length = 100)
	private String firstAnswer, secondAnswer, thirdAnswer, fourthAnswer;

	public Question(long id, String question, String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer ) {
		this.id = id;
		this.firstAnswer = firstAnswer;
		this.secondAnswer = secondAnswer;
		this.thirdAnswer = thirdAnswer;
		this.fourthAnswer = fourthAnswer;
		
		}
	public long getId() {
		return id;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String getFirstAnswer() {
		return firstAnswer;
	}
	
	public String getSecondAnswer() {
		return secondAnswer;
	}
	
	public String getThirdAnswer() {
		return thirdAnswer;
	}
	
	public String getFourthAnswer() {
		return fourthAnswer;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
