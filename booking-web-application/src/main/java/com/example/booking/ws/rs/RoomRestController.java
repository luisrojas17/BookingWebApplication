package com.example.booking.ws.rs;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.booking.models.Room;
import com.example.booking.services.RoomService;

/**
 * @author josel.rojas
 *
 */
@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {

	public final RoomService roomService;
	
	public RoomRestController(RoomService roomService) {
		this.roomService = roomService;
	}
	
	@GetMapping
	public List<Room> getAllRomms(){
		return roomService.getAllRooms();
	}
}
