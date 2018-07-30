package com.qa.Repository;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.domain.Question;
import com.qa.utility.JSONutil;

@Default
@Transactional(TxType.SUPPORTS)
public class QuestionRepo implements IQuestionRepo {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONutil util;

	public String showQuestion(Long id) {
		Question chosenQuestion = findQuestion(id);
		return chosenQuestion.getQuestion();
	}
	
	@Transactional(TxType.REQUIRED)
	public String chooseAnswer(Long id) {
		int choice = 0;
		String decision = "";
		Question chosenQuestion = findQuestion(id);

		switch (choice) {
		case 1:
			decision = chosenQuestion.getFirstAnswer();
			break;
		case 2:
			decision = chosenQuestion.getSecondAnswer();
			break;
		case 3:
			decision = chosenQuestion.getThirdAnswer();
			break;
		case 4:
			decision = chosenQuestion.getFourthAnswer();
			break;
		}
		return decision;

	}

	@Transactional(TxType.REQUIRED)
	public String getAllQuestions() {
		Query query = em.createQuery("SELECT m FROM QUESTION m");
		Collection<Question> allQuestions = (Collection<Question>) query.getResultList();
		return util.getJSONForObject(allQuestions);
	}

	private Question findQuestion(Long id) {
		return em.find(Question.class, id);
	}

}
