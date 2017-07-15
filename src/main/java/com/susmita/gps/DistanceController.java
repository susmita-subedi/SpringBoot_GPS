package com.susmita.gps;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistanceController {

	@RequestMapping("/distance")
	public Distance returnDistance(@RequestParam(value = "lat1") long lat1, @RequestParam(value = "lat2") long lat2,
			@RequestParam(value = "long1") long long1, @RequestParam(value = "long2") long long2) {
		int r = 6371; // average radius of the earth in km
		double dLat = Math.toRadians(lat2 - lat1);
		double dLon = Math.toRadians(long2 - long1);
		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(lat1))
				* Math.cos(Math.toRadians(lat2)) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double d = r * c;

		return new Distance(d);

	}

}
