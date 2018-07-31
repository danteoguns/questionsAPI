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
@Transactional(TxType.REQUIRED)
public class QuestionRepo implements IQuestionRepo {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONutil util;

	public String getAllQuestions() {
		Query query = em.createQuery("SELECT m FROM Question m");
		Collection<Question> allQuestions = (Collection<Question>) query.getResultList();
		return util.getJSONForObject(allQuestions);
	}

}
