package com.example.demo.Controllers;

import java.util.HashMap;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ExampleController
 */
@RestController
@RequestMapping("api/example")
 public class ExampleController {

	@GetMapping("/hello-world")
    public HashMap<String, String> sayHello() {
        var map = new HashMap<String, String>();
 
        map.put("greeting", "Hello");
        map.put("planet", "World");
		map.put("city", "Bangkok");
 
        return map;
    }	
}