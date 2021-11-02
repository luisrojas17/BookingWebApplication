package com.example.booking.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.booking.models.StaffMember;
import com.example.booking.repositorys.StaffRepository;

/**
 * @author josel.rojas
 *
 */
@Service
public class StaffService {

//	private static final List<StaffMember> staff = new ArrayList<>();
//	
//	static {
//		staff.add(new StaffMember(UUID.randomUUID().toString(), "John", "Doe", Position.CONCIERGE));
//		staff.add(new StaffMember(UUID.randomUUID().toString(), "Jane", "Doe", Position.FRONT_DESK));
//		staff.add(new StaffMember(UUID.randomUUID().toString(), "Oliver", "Handle", Position.SECURITY));
//		staff.add(new StaffMember(UUID.randomUUID().toString(), "Sanny", "Smith", Position.HOUSEKEEPING));
//	}
	
	private final StaffRepository staffRepository;
	
	public StaffService(StaffRepository staffRepository) {
		this.staffRepository = staffRepository;
	}
	
	public List<StaffMember> getAllStaff(){ 
		//return staff;
		return staffRepository.findAll();
	}
}
