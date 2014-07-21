package com.convertor.service;

import java.sql.Time;
import java.util.Date;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import cst_dom.Cst_historico;
import cst_dom.Cst_temperatura;
import cst_dom.Cst_tipo_consulta;
import cst_dom.Cst_usuario;

// TODO: Auto-generated Javadoc
/**
 * The Class TemperatureConvertorService.
 */
public class TemperatureConvertorService {
	
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
		
		PersistentTransaction t = null;
		try {
			t = cst_dom.UntitledPersistentManager.instance().getSession().beginTransaction();
		} catch (PersistentException e1) {
		
			e1.printStackTrace();
		}
		Double finalValue = null;
		try {	
			Integer idUser = logUser(login, password);
			if(idUser!=null){
				System.out.println(idUser);
				cst_dom.Cst_temperatura selectedConversion = new Cst_temperatura();
				if(temperature!=null && codConversion!=null){			
					cst_dom.Cst_temperatura[] cst_domCst_temperaturas = cst_dom.Cst_temperaturaDAO.listCst_temperaturaByQuery(null, null);
					if(cst_domCst_temperaturas!=null && cst_domCst_temperaturas.length>0){
						for(cst_dom.Cst_temperatura temperatura : cst_domCst_temperaturas){
							if(temperatura.getKey()==codConversion.doubleValue()){
								selectedConversion = temperatura;
								break;
							}
						}
						if(selectedConversion.getKey()==1){
							finalValue = selectedConversion.getConversion()-temperature;
						}
						else{
							finalValue = selectedConversion.getConversion()*temperature+32;
						}
						
						
						cst_dom.Cst_tipo_consulta consulta = new Cst_tipo_consulta();
						cst_dom.Cst_tipo_consulta[] cst_domCst_tipo_consultas = cst_dom.Cst_tipo_consultaDAO.listCst_tipo_consultaByQuery("idTipoConsulta = '"+1+"'", null);
						consulta = cst_domCst_tipo_consultas[0];
						cst_dom.Cst_usuario usuarioLog = new Cst_usuario();
						cst_dom.Cst_usuario[] cst_domCst_usuarios = cst_dom.Cst_usuarioDAO.listCst_usuarioByQuery(null, null);
						for(cst_dom.Cst_usuario usuario : cst_domCst_usuarios){
							if(usuario.getIdUsuario()==idUser.intValue()){
								usuarioLog = usuario;
								break;
							}
						}
						
						cst_dom.Cst_historico lcst_domCst_historico = cst_dom.Cst_historicoDAO.createCst_historico();			
						
						lcst_domCst_historico.setCst_tipo_consultaidTipoConsulta(consulta);
						lcst_domCst_historico.setCst_usuarioidUsuario(usuarioLog);
						lcst_domCst_historico.setFecha((Time) new Date());
						cst_dom.Cst_historicoDAO.save(lcst_domCst_historico);
						t.commit();
					}	
				}
			}		
		}
		catch (Exception e) {
			try {
				t.rollback();
			} catch (PersistentException e1) {
				
				e1.printStackTrace();
			}
		}
		
		return finalValue;
	}

	/**
	 * Log user.
	 *
	 * @param user the user
	 * @param password the password
	 * @return the integer
	 */
	public final Integer logUser(String user, String password){
		
		cst_dom.Cst_usuario[] cst_domCst_usuarios = null;
		try {
			cst_domCst_usuarios = cst_dom.Cst_usuarioDAO.listCst_usuarioByQuery(" user = '"+user+"' AND password = '"+password+"'", null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cst_domCst_usuarios[0].getIdUsuario();		
	}
	
	/**
	 * List historic.
	 *
	 * @param login the login
	 * @param password the password
	 * @return the cst_historico[]
	 */
	public final Cst_historico[] listHistoric(String login, String password){
		
		cst_dom.Cst_historico[] cst_domCst_historicos = null;
		try {
			Integer idUser = logUser(login, password);
			if(idUser!=null){
				cst_domCst_historicos = cst_dom.Cst_historicoDAO.listCst_historicoByQuery(null, null);
			}
		} catch (PersistentException e) {
			
			e.printStackTrace();
		}
		
		return cst_domCst_historicos;
	}

}
