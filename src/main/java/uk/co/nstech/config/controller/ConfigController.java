package uk.co.nstech.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Value("${application.info}")
	String applicationInfo;

	@RequestMapping("/")
	public String get() {
		return "application.info set to '" + applicationInfo + "'";
	}

}