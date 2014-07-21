package com.web.converter;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.web.converter.TemperatureConverterServiceStub.ConvertTemperature;
import com.web.converter.TemperatureConverterServiceStub.ConvertTemperatureResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class TemperatureConverterTest.
 */
public class TemperatureConverterTest {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		try {
			TemperatureConverterServiceStub temperatureConverterServiceStub = new TemperatureConverterServiceStub();
			ConvertTemperature convertTemperature = new ConvertTemperature();
			convertTemperature.setLogin("admin");
			convertTemperature.setPassword("admin");
			convertTemperature.setCodConversion(1);
			convertTemperature.setTemperature(-20);
			try {			
				ConvertTemperatureResponse convertTemperatureResponse = temperatureConverterServiceStub.convertTemperature(convertTemperature);
				System.out.println(convertTemperatureResponse.get_return());
			} catch (RemoteException e) {
				
				e.printStackTrace();
			}
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
