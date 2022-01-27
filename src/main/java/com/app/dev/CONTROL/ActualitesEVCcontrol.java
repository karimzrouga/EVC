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

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import com.app.dev.MODEL.ActualitesEVC;
import com.app.dev.SERVICES.Actualitesservices;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ActualitesEVCcontrol {
	@Autowired
	private Actualitesservices cs;
	// private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@GetMapping(path = "/actualitesall")
	public @ResponseBody Iterable<ActualitesEVC> getAll() {
		return cs.findAll();
	}

	@GetMapping(path = "/actualiteshello")
	public String test() {

		return "actualites DONE";
	}

	@GetMapping(value = "/actualitesfind{fid}")
	public Optional<ActualitesEVC> findbyid(@PathVariable int fid) {
		Optional<ActualitesEVC> fc = cs.findbyid(fid);
		if (fc != null) {
			return fc;
		} else {
			return null;
		}
	}

	@PostMapping(path = { "/actualitesnew" })
	private ActualitesEVC addactualites(@RequestBody ActualitesEVC act) {
		if (act == null) {
			return null;
		} else

		{
			return cs.create(act);

		}
		// return medca.toString();

	}

	@PutMapping(path = { "/actualitesupdate" })
	private ActualitesEVC updateactualites(@RequestBody ActualitesEVC act) {
		return cs.update(act);
	}

	@DeleteMapping(path = "/actualitesdelete{id}")
	private ActualitesEVC DeleteActualite(@PathVariable int id) {
		cs.Delete(id);
		return null;

	}

}
