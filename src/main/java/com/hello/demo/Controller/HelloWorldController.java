package com.hello.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//@RequestMapping(method= RequestMethod.GET, path="/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/helloworldbean")
	public UserDeatails helloWorldBean() {
		return new UserDeatails("Nikhil","Jaiswal","Jabalpur");
	}
}
