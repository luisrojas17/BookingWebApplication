package com.example.booking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author josel.rojas
 *
 */
@Controller
public class AuthenticationController {

	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
}
