
package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiController1 {

String name = "Ashif";

@GetMapping("/")

public String getName() {

return "welcome "+name+" !";

}}
