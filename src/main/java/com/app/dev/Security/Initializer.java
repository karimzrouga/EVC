/*package com.app.dev.Security;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.dev.MODEL.Appuser;
import com.app.dev.SERVICES.UserService;

@Component
public class Initializer implements CommandLineRunner {

	private final Log logger = LogFactory.getLog(Initializer.class);

	@Autowired
	private UserService userService;

	@Override
	public void run(String... strings) throws Exception {

		if (userService.findAll().isEmpty()) {
			logger.info("No Users accounts found. Creating some users");

			Appuser user = new Appuser("amdin", "evcamdin");
			userService.save(user);
		}
	}
}*/