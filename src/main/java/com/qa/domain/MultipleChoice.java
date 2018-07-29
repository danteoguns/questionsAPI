package com.qa.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "questions", "answers" })

@Component
public class MultipleChoice {

	@JsonProperty("questions")
	private ArrayList<String> questions;

	@JsonProperty("answers")
	private ArrayList<String> answers;

	private Scanner reader;

	public MultipleChoice() {

		questions = new ArrayList<String>();
		answers = new ArrayList<String>();
		openFile();
		readQuestions();
		readAnswers();
		reader.close();

	}
	@JsonProperty("questions")
	public ArrayList<String> getQuestions() {
		return questions;
	}

	@JsonProperty("answers")
	public ArrayList<String> getAnswers() {
		return answers;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	private void openFile() {

		try {
			reader = new Scanner(new File("questionsAnswers.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private ArrayList<String> readQuestions() {

		String question = "";

		while (reader.hasNext("Q")) {
			question = reader.nextLine();
			questions.add(question);
		}
		return questions;

	}
	
	private ArrayList<String> readAnswers() {

		String answer = "";

		while (reader.hasNext("A")) {
			answer = reader.nextLine();
			answers.add(answer);
		}
		return answers;

	}

}
