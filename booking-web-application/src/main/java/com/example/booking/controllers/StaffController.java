package com.example.booking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.booking.services.StaffService;

/**
 * @author josel.rojas
 *
 */
@Controller
@RequestMapping("/staff")
public class StaffController {

	private final StaffService staffService;
	
	//It get a staff service element that is injecting as part of constructor and Spring does that
	//automatically without an auto-wiring because just that´s a constructor on this class and StaffService
	//is a component. 
	public StaffController(StaffService staffService) {
		this.staffService = staffService;
	}
	
	@GetMapping
	public String getAllStaff(Model model) {
		model.addAttribute("staff", staffService.getAllStaff());
		return "staff";
	}
}
