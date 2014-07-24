package com.qubaopen.survey.service.interest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import com.qubaopen.survey.entity.interest.Interest
import com.qubaopen.survey.entity.interest.InterestQuestionOption
import com.qubaopen.survey.entity.interest.InterestResultOption
import com.qubaopen.survey.entity.interest.InterestUserAnswer
import com.qubaopen.survey.entity.interest.InterestUserQuestionnaire
import com.qubaopen.survey.entity.user.User
import com.qubaopen.survey.repository.interest.InterestSpecialInsertRepository
import com.qubaopen.survey.repository.interest.InterestUserAnswerRepository
import com.qubaopen.survey.repository.interest.InterestUserQuestionnaireRepository

@Service
public class InterestService {

	@Autowired
	InterestSpecialInsertRepository interestSpecialInsertRepository

	@Autowired
	InterestUserQuestionnaireRepository interestUserQuestionnaireRepository

	@Autowired
	InterestUserAnswerRepository interestUserAnswerRepository

	@Transactional
	saveQuestionnaireAndUserAnswers(User user, Interest interest, List<InterestQuestionOption> questionOptions, InterestResultOption resultOption) {

		def interestUserQuestionnaire = new InterestUserQuestionnaire(
			user : user,
			interest : interest,
			interestResultOption : resultOption,
			status : InterestUserQuestionnaire.status.COMPLETED,
			time : new Date()
		)
		interestUserQuestionnaire =	interestUserQuestionnaireRepository.save(interestUserQuestionnaire)

		def userAnswers = []
		questionOptions.each {
			def answer = new InterestUserAnswer(
				user : user,
				interestUserQuestionnaire : interestUserQuestionnaire,
				interestQuestionOption : it,
				interestQuestion : it.interestQuestion,
				content : it.content,
				point : it.score
			)
			userAnswers << answer
		}
		interestUserAnswerRepository.save(userAnswers)
	}

}
