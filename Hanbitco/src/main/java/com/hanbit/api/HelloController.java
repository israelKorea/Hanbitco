package com.hanbit.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	/*
	 * Get API
	 * 
	 * @param id
	 * @return API
	 * */
	@RequestMapping(value = "/api/v1/data/currency/{currency}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody String getApi(@PathVariable("currency") final String currency) {
		
		if(currency.equals(null)) {
			return "null";
		}else {
			return "Hello, Spring boot!";	
		}
	}

}
