package com.app.dev.CONTROL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dev.MODEL.Appuser;
import com.app.dev.SERVICES.appuserservices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AppuserController {

	@Autowired
	private appuserservices aus;

	@GetMapping(path = "/auth")
	public Appuser basicauth(@RequestHeader("Authorization") String authorization) {
		
		return new Appuser();
	}

	@PostMapping(path = { "/useredit" })
	private Appuser adduser(@RequestBody Appuser user) {
		if (user == null) {
			return null;
		} else

		{
			return aus.create(user);

		}

	}

	@GetMapping(path = "/findbyusername{username}")
	public Appuser  getuser( @PathVariable String username ) {
		return aus.findByusername(username );
	}
}
