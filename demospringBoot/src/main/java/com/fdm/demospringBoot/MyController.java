package com.fdm.demospringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@Autowired
	CandleRepo crep;
	

	@GetMapping("/greet") 
	public String doWork(){
		
		Candle candle = new Candle();  
		candle.setCandleId(56);
		
		crep.save(candle);
		
		
		
		return "greeting";
	}
	
}
