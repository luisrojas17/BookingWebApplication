package com.example.booking.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.booking.models.Room;
import com.example.booking.repositorys.RoomRepository;

/**
 * @author josel.rojas
 *
 */
@Service
public class RoomService {

//	private static final List<Room> rooms = new ArrayList<>();
//	
//	static {
//		for(int i = 0; i<10; i++) {
//			rooms.add(new Room(i, "Room " + i, "R"+i, "Q"));
//		}
//	}
	
	private final RoomRepository roomRepository;
	
	public RoomService(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
		
	}
	
	public List<Room> getAllRooms() {
		//return rooms;
		return roomRepository.findAll();
	}
	
	public Room getById(long id) {
		return roomRepository.getById(id);
	}
}
