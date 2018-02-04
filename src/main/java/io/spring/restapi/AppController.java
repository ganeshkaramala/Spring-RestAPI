package io.spring.restapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
	
	@RequestMapping(value = "/", method = { RequestMethod.GET,
			RequestMethod.POST })
	public ResponseEntity<String> welcomeGET(
			@RequestParam(required = false, value = "name") String name) {

		String welcome = "";
		if (name != null && name.length() > 0) {
			welcome = "<h1>Welcome Spring REST API Tutorial" + name + "!</h1>";
		} else {
			welcome = "<h1>Welcome to Spring REST API Tutorial!</h1>";
		}

		return new ResponseEntity<String>(welcome, HttpStatus.OK);
	}
}
