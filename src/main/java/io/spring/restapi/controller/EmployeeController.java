package io.spring.restapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.spring.restapi.dto.BaseResponseDTO;

@Controller
public class EmployeeController {
	
	
	@RequestMapping(value="/employee/{id}",method=RequestMethod.GET)
	@ResponseBody
	public BaseResponseDTO loadEmployee(){
		return null;
	}
	
	@RequestMapping(value="/employees",method=RequestMethod.GET)
	@ResponseBody
	public BaseResponseDTO loadEmployees(){
		return null;
	}
	
	@RequestMapping(value="/employee/{id}",method=RequestMethod.POST)
	@ResponseBody
	public BaseResponseDTO insertEmployee(){
		return null;
	}
	
	@RequestMapping(value="/employees",method=RequestMethod.POST)
	@ResponseBody
	public BaseResponseDTO insertEmployees(){
		return null;
	}
	
	@RequestMapping(value="/employee/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public BaseResponseDTO updateEmployee(){
		return null;
	}
	
	@RequestMapping(value="/employees",method=RequestMethod.PUT)
	@ResponseBody
	public BaseResponseDTO updateEmployees(){
		return null;
	}
	
	@RequestMapping(value="/employee/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public BaseResponseDTO deleteEmployee(){
		return null;
	}
	
	@RequestMapping(value="/employees",method=RequestMethod.DELETE)
	@ResponseBody
	public BaseResponseDTO deleteEmployees(){
		return null;
	}

}
