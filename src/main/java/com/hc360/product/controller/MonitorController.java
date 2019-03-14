package com.hc360.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * 监控页
 */
@RequestMapping("/monitor")
@Controller
public class MonitorController {
	
	@RequestMapping("/ok")
	@ResponseBody
	public String info() {
		return "ok";
	}
}
