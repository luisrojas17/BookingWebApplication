package com.example.booking.ws.rs;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.booking.models.StaffMember;
import com.example.booking.services.StaffService;

/**
 * @author josel.rojas
 *
 */
@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

	private final StaffService staffService; 
	
	public StaffRestController(StaffService staffService) {
		this.staffService = staffService;
	}
	
	@GetMapping
	public List<StaffMember> getAllStaff(){
		return staffService.getAllStaff();
	}
}
