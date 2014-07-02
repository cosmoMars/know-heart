package com.qubaopen.survey.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.system.SystemVersion;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.system.SystemVersionRepository;

@RestController
@RequestMapping("systemVersions")
public class SystemVersionController extends AbstractBaseController<SystemVersion, Long> {

	@Autowired
	private SystemVersionRepository systemVersionRepository;

	@Override
	protected MyRepository<SystemVersion, Long> getRepository() {
		return systemVersionRepository;
	}

}
