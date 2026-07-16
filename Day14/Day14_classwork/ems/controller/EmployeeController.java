package com.coforge.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired // Annoation based used to do field injection
	private EmployeeService service;

	@RequestMapping("home")
	public ModelAndView loadHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");// the extension is added at dis
		return mv;// it acts as disptcher forward
	}

	@RequestMapping(method = RequestMethod.POST, value = "employee", params = "Insert")
	public ModelAndView createEmployee(@ModelAttribute Employee employee) {
		ModelAndView mv = new ModelAndView();
		

		String result = "";

		boolean status = service.createEmployee(employee);

		if (status) {
			result = "SUCCESS: Employee object saved";
		} else {
			result = "FAILED : Employee object not saved";
		}
		mv.setViewName("EmployeeHome");
		mv.addObject("result", result);
		
		return mv;

	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "employee", params = "Update")
	public ModelAndView updateEmployee(@ModelAttribute Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");

		String result = "";

		boolean status = service.updateEmployee(employee);

		if (status) {
			result = "SUCCESS: Employee object updated";
		} else {
			result = "FAILED : Employee object not saved";
		}
		
		mv.addObject("result", result);
		
		return mv;

	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "employee", params = "Delete")
	public ModelAndView deleteEmployee(@RequestParam int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");

		String result = "";

		boolean status = service.deleteEmployee(eid);

		if (status) {
			result = "SUCCESS: Employee object deleted";
		} else {
			result = "FAILED : Employee object not deleted";
		}
		
		mv.addObject("result", result);
		
		return mv;

	}
	
	@RequestMapping(method = RequestMethod.POST, value = "employee", params = "Find")
	public ModelAndView findEmployee(@RequestParam int eid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");

		String result = "";

		Employee emp = service.findEmployee(eid);

		if (emp!= null) {
			result = emp.toString();
		} else {
			result = "FAILED : Employee object not found";
		}
		
		mv.addObject("result", result);
		
		return mv;

	}
	
	@RequestMapping(method = RequestMethod.POST, value = "employee", params = "FindAll")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");

		String result = "";

		List<Employee> emp = service.findAll();

		if (emp!= null) {
			result = emp.toString();
		} else {
			result = "FAILED : Employee object not found";
		}
		
		mv.addObject("result", emp);
		
		return mv;

	}
}
