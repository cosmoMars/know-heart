package com.qubaopen.survey.controller.interest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.interest.InterestContentType;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.interest.InterestContentTypeRepository;

@RestController
@RequestMapping("interestContentTypes")
public class InterestContentTypeController extends AbstractBaseController<InterestContentType, Long> {

	@Autowired
	private InterestContentTypeRepository interestContentTypeRepository;

	@Override
	protected MyRepository<InterestContentType, Long> getRepository() {
		return interestContentTypeRepository;
	}

}
