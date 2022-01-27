package com.app.dev.CONTROL;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dev.MODEL.Offre;
import com.app.dev.SERVICES.Offreservices;

@RestController
@CrossOrigin(origins = "*")

@RequestMapping("/api")

public class Offrecontrol {
	@Autowired
	private Offreservices os;

	@GetMapping(path = "/offresall")
	public @ResponseBody Iterable<Offre> getAll() {
		return os.findAll();
	}

	@GetMapping(path = "/offreshello")
	public String test() {
		return "offres DONE";
	}

	@GetMapping(value = "/offresfind{fid}")
	public Optional<Offre> findbyid(@PathVariable int fid) {
		Optional<Offre> fc = os.findbyid(fid);
		if (fc != null) {
			return fc;
		} else {
			return null;
		}
	}

	@PostMapping(path = { "/offresnew" })
	private Offre addoffre(@RequestBody Offre offre) {
		if (offre == null) {
			return null;
		} else

		{
			return this.os.create(offre);

		}

	}

	@PutMapping(path = { "/offresupdate" })
	private Offre updateoffre(@RequestBody Offre offre) {
		return os.update(offre);
	}

	@DeleteMapping(path = "/offresdelete{id}")
	private Offre Deleteoffre(@PathVariable int id) {

		os.Delete(id);
		return null;

	}
}
