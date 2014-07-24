package com.qubaopen.survey.controller.interest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import com.qubaopen.survey.controller.AbstractBaseController
import com.qubaopen.survey.entity.interest.Interest
import com.qubaopen.survey.entity.user.User
import com.qubaopen.survey.repository.MyRepository
import com.qubaopen.survey.repository.interest.InterestRepository

@RestController
@RequestMapping("interests")
public class InterestController extends AbstractBaseController<Interest, Long> {

	@Autowired
	InterestRepository interestRepository

	@Override
	protected MyRepository<Interest, Long> getRepository() {
		interestRepository
	}

	@RequestMapping(value = 'findInterest', method = RequestMethod.GET)
	findInterest(@RequestBody User user) {

	interestRepository.findUnfinishInterest(user)

	}
}
