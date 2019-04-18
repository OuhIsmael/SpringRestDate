package com.ictcg.SpringRestDate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ictcg.SpringRestDate.model.RestDate;
import com.ictcg.SpringRestDate.service.RestDateService;

@RequestMapping("date")
@RestController
public class RestDateController {
	
	@Autowired
	private RestDateService restDateService;
	
	@GetMapping("/getDate")
	public RestDate getRestDate() {
		return restDateService.getRestDate();
	}

}
