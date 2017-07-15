package com.susmita.gps;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistanceController {
	private double distance;
	
	@RequestMapping("/distance")
	public Distance returnDistance(@RequestParam(value="lat1")String lat1 , @RequestParam(value="lat2") String lat2,
	@RequestParam(value="long1")String long1,  @RequestParam(value="long2") String long2){
	distance = 5;
	return new Distance(distance);
		
	}
	
	
}
