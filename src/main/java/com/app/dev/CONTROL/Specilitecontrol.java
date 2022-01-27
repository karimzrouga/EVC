package com.app.dev.CONTROL;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dev.MODEL.Specialite;
import com.app.dev.SERVICES.Specialiteservices;

@RestController
@CrossOrigin(origins = "*")

@RequestMapping("/api")
public class Specilitecontrol {
	@Autowired
	private Specialiteservices ss;

	@GetMapping(path = "/Specialitesall")
	public @ResponseBody Iterable<Specialite> getAll() {
		return ss.findAll();
	}

	@GetMapping(path = "/specialitehello")
	public String test() {
		return "specialite DONE";
	}

	@GetMapping(value = "/Specialitesfind{id}")
	public Optional<Specialite> findbyid(@PathVariable int id) {
		Optional<Specialite> spec = ss.findbyid(id);
		if (spec != null) {
			return spec;
		} else {
			return null;
		}
	}

	@PostMapping(path = { "/Specialitesnew" })
	private Specialite addSpecialite(@RequestBody Specialite Specialite) {
		if (Specialite == null) {
			return null;
		} else

		{
			return this.ss.create(Specialite);

		}

	}

	@PutMapping(path = { "/Specialitesupdate" })
	private Specialite updateSpecialite(@RequestBody Specialite Specialite) {
		return ss.update(Specialite);
	}

	@DeleteMapping(path = "/Specialitesdelete{id}")
	private Specialite DeleteSpecialite(@PathVariable int id) {

		ss.Delete(id);
		return null;

	}

}
