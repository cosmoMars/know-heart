package com.qubaopen.survey.controller.interest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.interest.InterestUser;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.interest.InterestUserRepository;

@RestController
@RequestMapping("interestUsers")
public class InterestUserController extends AbstractBaseController<InterestUser, Long> {

	@Autowired
	private InterestUserRepository interestUserRepository;
	
	@Override
	protected MyRepository<InterestUser, Long> getRepository() {
		return interestUserRepository;
	}

}
