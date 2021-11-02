package com.example.booking.messaging.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.booking.models.Room;
import com.example.booking.services.RoomService;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author josel.rojas
 *
 */
//@Component
public class RoomCleanerListener {

	private static final Logger logger = LoggerFactory.getLogger(RoomCleanerListener.class);
	
	private final ObjectMapper mapper;
	private RoomService roomService;
	
	public RoomCleanerListener(ObjectMapper mapper, RoomService roomService) {
		this.mapper = mapper;
		this.roomService = roomService;
		
	}
	
	public void receiveMessage(String message) {
		
		try {
			
			AsyncPayload payload = mapper.readValue(message, AsyncPayload.class);
			
			if("ROOM".equals(payload.getModel())) {
				Room room = roomService.getById(payload.getId());
				logger.info("ROOM [{}:{}] needs to be cleanned.", room.getNumber(), room.getName());
			} else {
				logger.warn("Unknown model type.");
			}
			
		} catch(Exception ex) {
			logger.error("Ocurrio un errror al colocar el mensaje en la Queue.", ex);
		}
	}
}
