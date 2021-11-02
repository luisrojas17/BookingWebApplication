package com.example.booking.actuator.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/**
 * @author josel.rojas
 *
 */
@Component
@Endpoint(id="greeting")
public class GreetingEndpoint {

	@ReadOperation
	public String getGreeting() {
		return "Hello from actuator!!!";
	}
}
