package com.demo.spring_tool_jenkins;


@RestController
public class GreetrestController {
	@GetMapping("/greet")
	public String getGreet() {
		return "greetings from Rest"
;	}

}
