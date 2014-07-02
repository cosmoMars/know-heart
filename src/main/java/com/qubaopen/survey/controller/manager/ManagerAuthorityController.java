package com.qubaopen.survey.controller.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.manager.ManagerAuthority;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.manager.ManagerAuthorityRepository;

@RestController
@RequestMapping("managerAuthoritys")
public class ManagerAuthorityController extends AbstractBaseController<ManagerAuthority, Long> {

	@Autowired
	private ManagerAuthorityRepository managerAuthorityRepository;
	
	@Override
	protected MyRepository<ManagerAuthority, Long> getRepository() {
		return managerAuthorityRepository;
	}

}
