package com.example.booking.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.booking.models.Room;

/**
 * @author josel.rojas
 *
 */
public interface RoomRepository extends JpaRepository<Room, Long>{

}
