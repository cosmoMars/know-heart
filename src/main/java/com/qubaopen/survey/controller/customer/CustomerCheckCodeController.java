package com.qubaopen.survey.controller.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qubaopen.survey.controller.AbstractBaseController;
import com.qubaopen.survey.entity.customer.CustomerCheckCode;
import com.qubaopen.survey.repository.MyRepository;
import com.qubaopen.survey.repository.customer.CustomerCheckCodeRepository;

@RestController
@RequestMapping("customerCheckCodes")
public class CustomerCheckCodeController extends AbstractBaseController<CustomerCheckCode, Long> {

	@Autowired
	private CustomerCheckCodeRepository customerCheckCodeRepository;

	@Override
	protected MyRepository<CustomerCheckCode, Long> getRepository() {
		return customerCheckCodeRepository;
	}

}
