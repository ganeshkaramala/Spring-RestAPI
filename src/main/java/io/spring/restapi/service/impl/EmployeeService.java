package io.spring.restapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import io.spring.restapi.service.IEmployeeService;
import io.spring.restapi.validation.BeanValidator;

public class EmployeeService implements IEmployeeService{

	@Autowired
	private BeanValidator beanValidator;
	
	@Override
	public void updateEmployess() {
		beanValidator.validate();
	}

}
