package com.example.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
 * 	@SpringBootApplication is an stereotype of auto-configuration.
 * 
 *  Many projects include pre-configured default properties for the auto-configuration classes themselves.
 *  There´s an annotation to load there properties called @EnabledConfigurationProperties and these properties
 *  set the default values
 * 
 * 
 * 
 * See: 
 * 	@AutoConfigurationBefore and @AutoConfigurationAfter
 * 	@ConditionalOnClass, @ConditionalOnBean
 * 	@ConditionalOnProperty
 * 	@ConditionalOnMissingBean
 * 
 * 
 * @author josel.rojas
 *
 */
@SpringBootApplication
public class BookingWebApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BookingWebApplication.class, args);
	}

}
