package com.web.converter;

import com.convertor.service.TemperatureConvertorService;

import cst_dom.Cst_historico;

// TODO: Auto-generated Javadoc
/**
 * The Class TemperatureConverterService.
 */
public class TemperatureConverterService {

	/**
	 * Convert temperature.
	 *
	 * @param temperature the temperature
	 * @param codConversion the cod conversion
	 * @param login the login
	 * @param password the password
	 * @return the double
	 */
	public final Double convertTemperature(Double temperature, Integer codConversion, String login, String password){
		TemperatureConvertorService service = new TemperatureConvertorService();
		return service.convertTemperature(temperature, codConversion, login, password);
	}
	
	/**
	 * Log user.
	 *
	 * @param user the user
	 * @param password the password
	 * @return the integer
	 */
	public final Integer logUser(String user, String password){
		TemperatureConvertorService service = new TemperatureConvertorService();
		return service.logUser(user, password);
	}
	
	/**
	 * List historic.
	 *
	 * @param login the login
	 * @param password the password
	 * @return the cst_historico[]
	 */
	public final Cst_historico[] listHistoric(String login, String password){
		TemperatureConvertorService service = new TemperatureConvertorService();
		return service.listHistoric(login, password);
	}
}
