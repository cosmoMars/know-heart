package com.qubaopen.survey.controller.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.customer.CustomerInfo;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.customer.CustomerInfoRepository;

@RestController
@RequestMapping("customerInfos")
public class CustomerInfoController extends AbstractBaseController<CustomerInfo, Long> {

	@Autowired
	private CustomerInfoRepository customerInfoRepository;

	@Override
	protected MyRepository<CustomerInfo, Long> getRepository() {
		return customerInfoRepository;
	}

}
