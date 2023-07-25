package com.masai;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/hello")
	public ResponseEntity<String> helloWorld(){
		return new ResponseEntity<String>("Hello Rishab",HttpStatus.ACCEPTED);
	}
	
}
