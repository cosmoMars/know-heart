package com.qubaopen.survey.controller.interest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.interest.InterestTag;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.interest.InterestTagRepository;

@RestController
@RequestMapping("interestTags")
public class InterestTagController extends AbstractBaseController<InterestTag, Long> {

	@Autowired
	private InterestTagRepository interestTagRepository;
	
	@Override
	protected MyRepository<InterestTag, Long> getRepository() {
		return interestTagRepository;
	}

}
