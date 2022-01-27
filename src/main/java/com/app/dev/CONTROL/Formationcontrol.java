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

import com.app.dev.MODEL.Formation;
import com.app.dev.SERVICES.Formationservices;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")

public class Formationcontrol {
	@Autowired
	private Formationservices fs;

	@GetMapping(path = "/formationsall")
	public @ResponseBody Iterable<Formation> getAll() {
		return fs.findAll();
	}

	@GetMapping(path = "/formationshello")
	public String test() {
		return "formations DONE";
	}

	@GetMapping(value = "/formationsfind{fid}")
	public Optional<Formation> findbyid(@PathVariable int fid) {
		Optional<Formation> fc = fs.findbyid(fid);
		if (fc != null) {
			return fc;
		} else {
			return null;
		}
	}

	@PostMapping(path = { "/formationsnew" })
	private Formation addformations(@RequestBody Formation formation) {
		if (formation == null) {
			return null;
		} else

		{
			return this.fs.create(formation);

		}

	}

	@PutMapping(path = { "/formationsupdate" })
	private Formation updateformations(@RequestBody Formation formation) {
		return fs.update(formation);
	}

	@DeleteMapping(path = "/formationsdelete{id}")
	private Formation DeleteFormation(@PathVariable int id) {

		fs.Delete(id);
		return new Formation();

	}

	@GetMapping(value = "/formationsimage{fid}")
	public String findimagesbyid(@PathVariable int fid) {
		Optional<Formation> fc = fs.findbyid(fid);
		if (fc != null) {
			return fc.get().getImage();
		} else {
			return null;
		}
	}
}
