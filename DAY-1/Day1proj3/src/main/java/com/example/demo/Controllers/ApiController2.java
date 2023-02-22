
package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiController2 {

String color = "Black";

@GetMapping("/")

public String getName() {

return "My Favourite colour is "+color;

}}