package com.qubaopen.survey.controller.interest;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.interest.InterestSelectionType;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.interest.InterestSelectionTypeRepository;

//@RestController
//@RequestMapping("interestContentTypes")
public class InterestSelectionTypeController extends AbstractBaseController<InterestSelectionType, Long> {

	@Autowired
	private InterestSelectionTypeRepository interestSelectionTypeRepository;

	@Override
	protected MyRepository<InterestSelectionType, Long> getRepository() {
		return interestSelectionTypeRepository;
	}

}
