package com.qa.interoperability;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.service.IQuestionService;

@Path("/question")
public class AccountEndPoint {

	@Inject
	private IQuestionService service;

	@Path("/show-question/{id}")
	@GET
	@Produces("application/json")
	public String showQuestion(@PathParam("id") Long id) {
		return service.showQuestion(id);
	}

	@Path("/all-questions/")
	@GET
	@Produces("application/json")
	public String getAllQuestions() {
		return service.getAllQuestions();
	}

	@Path("/choose-answer/{id}")
	@DELETE
	@Produces("application/json")
	public String chooseAnswer(@PathParam("id") Long id) {
		return service.chooseAnswer(id);
	}

}
