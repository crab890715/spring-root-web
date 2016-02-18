package com.beacon.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller 
@RequestMapping("/demo")
//@Controller
public class DemoController {
	@RequestMapping(value="/demo",method=RequestMethod.GET) 
	public String demo() { 
		return "index";
	}
}
