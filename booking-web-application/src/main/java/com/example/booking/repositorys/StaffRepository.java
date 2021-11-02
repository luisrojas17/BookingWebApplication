package com.example.booking.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.booking.models.StaffMember;

/**
 * @author josel.rojas
 *
 */
public interface StaffRepository extends JpaRepository<StaffMember, String> {

}
