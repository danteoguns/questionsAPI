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

	@Path("/all-questions/")
	@GET
	@Produces("application/json")
	public String getAllQuestions() {
		return service.getAllQuestions();
	}

}
