package com.web.convertertest;

import com.convertor.service.TemperatureConvertorService;

public class TestServiceImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TemperatureConvertorService temperatureConvertorService = new TemperatureConvertorService();
		System.out.println(temperatureConvertorService.convertTemperature(-40.0, 1, "admin", "admin"));
		

	}

}