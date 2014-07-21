/**
 * 
 */
package com.convertor.test;

import com.convertor.service.TemperatureConvertorService;

import junit.framework.TestCase;

/**
 * @author Mauricio
 *
 */
public class JUnitTest extends TestCase {
	
	protected String login = "admin";
	protected String password = "admin";
	protected Double temperature = 40.0;
	protected Integer idCase = 1;

	/**
	 * @param name
	 */
	public JUnitTest(String name) {
		super(name);
	}

	public void testAdd() {
        assertTrue(new TemperatureConvertorService().convertTemperature(temperature, idCase, login, password) != null);
        assertTrue(new TemperatureConvertorService().logUser(login, password) != null);
    }
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
