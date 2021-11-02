package com.example.booking.models;

/**
 * @author josel.rojas
 *
 */
public enum Position {
	HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;
	
	@Override
	public String toString() {
		switch(this) {
			case CONCIERGE:
				return "Concierge";
			case HOUSEKEEPING:
				return "Housekeeping";
			case FRONT_DESK:
				return "Front Desk";
			case SECURITY:
				return "Security";
			default:
				return "";
		}
	}
}
