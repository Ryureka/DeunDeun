package com.deun.controller;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControl {
	@RequestMapping
	public String bb() {
		return "sdaf";
	}

}
