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

import com.app.dev.MODEL.Candidat;
import com.app.dev.SERVICES.Candidatservices;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class Candidatcontrol {
	@Autowired
	private Candidatservices cs;

	@GetMapping(path = "/candidatall")
	public @ResponseBody Iterable<Candidat> getAll() {
		return cs.findAll();
	}

	@GetMapping(path = "/candidathello")
	public String test() {
		return "candidat DONE";
	}

	@GetMapping(value = "/candidatfind{fid}")
	public Optional<Candidat> findbyid(@PathVariable int fid) {
		Optional<Candidat> fc = cs.findbyid(fid);
		if (fc != null) {
			return fc;
		} else {
			return null;
		}
	}

	@PostMapping(path = { "/candidatadd" })
	private Candidat addcondidat(@RequestBody Candidat medca) {
		if (medca == null) {
			return null;
		} else

		{
			return cs.create(medca);

		}
		// return medca.toString();

	}

	@PutMapping(path = { "/candidatupdate" })
	private Candidat updatecondidat(@RequestBody Candidat medca) {
		return cs.update(medca);
	}

	@DeleteMapping(path = "/candidatdelete{id}")
	private void Deletecondidat(@PathVariable int id) {
		cs.Delete(id);

	}
}
