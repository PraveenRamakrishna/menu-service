package com.example.controller;

import java.awt.Menu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/menu")
public class MenuController {
	
	@RequestMapping(method = RequestMethod.GET)
	public Menu getMenuItems(){
		return null;
	}

}
