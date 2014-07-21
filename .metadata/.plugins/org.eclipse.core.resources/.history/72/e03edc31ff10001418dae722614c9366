/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListUntitledData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Cst_temperatura...");
		cst_dom.Cst_temperatura[] cst_domCst_temperaturas = cst_dom.Cst_temperaturaDAO.listCst_temperaturaByQuery(null, null);
		int length = Math.min(cst_domCst_temperaturas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(cst_domCst_temperaturas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cst_usuario...");
		cst_dom.Cst_usuario[] cst_domCst_usuarios = cst_dom.Cst_usuarioDAO.listCst_usuarioByQuery(null, null);
		length = Math.min(cst_domCst_usuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(cst_domCst_usuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cst_rol...");
		cst_dom.Cst_rol[] cst_domCst_rols = cst_dom.Cst_rolDAO.listCst_rolByQuery(null, null);
		length = Math.min(cst_domCst_rols.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(cst_domCst_rols[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cst_historico...");
		cst_dom.Cst_historico[] cst_domCst_historicos = cst_dom.Cst_historicoDAO.listCst_historicoByQuery(null, null);
		length = Math.min(cst_domCst_historicos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(cst_domCst_historicos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cst_tipo_consulta...");
		cst_dom.Cst_tipo_consulta[] cst_domCst_tipo_consultas = cst_dom.Cst_tipo_consultaDAO.listCst_tipo_consultaByQuery(null, null);
		length = Math.min(cst_domCst_tipo_consultas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(cst_domCst_tipo_consultas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Cst_temperatura by Criteria...");
		cst_dom.Cst_temperaturaCriteria cst_temperaturaCriteria = new cst_dom.Cst_temperaturaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//cst_temperaturaCriteria.idTemperatura.eq();
		cst_temperaturaCriteria.setMaxResults(ROW_COUNT);
		cst_dom.Cst_temperatura[] cst_domCst_temperaturas = cst_temperaturaCriteria.listCst_temperatura();
		int length =cst_domCst_temperaturas== null ? 0 : Math.min(cst_domCst_temperaturas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(cst_domCst_temperaturas[i]);
		}
		System.out.println(length + " Cst_temperatura record(s) retrieved."); 
		
		System.out.println("Listing Cst_usuario by Criteria...");
		cst_dom.Cst_usuarioCriteria cst_usuarioCriteria = new cst_dom.Cst_usuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//cst_usuarioCriteria.idUsuario.eq();
		cst_usuarioCriteria.setMaxResults(ROW_COUNT);
		cst_dom.Cst_usuario[] cst_domCst_usuarios = cst_usuarioCriteria.listCst_usuario();
		length =cst_domCst_usuarios== null ? 0 : Math.min(cst_domCst_usuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(cst_domCst_usuarios[i]);
		}
		System.out.println(length + " Cst_usuario record(s) retrieved."); 
		
		System.out.println("Listing Cst_rol by Criteria...");
		cst_dom.Cst_rolCriteria cst_rolCriteria = new cst_dom.Cst_rolCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//cst_rolCriteria.idRol.eq();
		cst_rolCriteria.setMaxResults(ROW_COUNT);
		cst_dom.Cst_rol[] cst_domCst_rols = cst_rolCriteria.listCst_rol();
		length =cst_domCst_rols== null ? 0 : Math.min(cst_domCst_rols.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(cst_domCst_rols[i]);
		}
		System.out.println(length + " Cst_rol record(s) retrieved."); 
		
		System.out.println("Listing Cst_historico by Criteria...");
		cst_dom.Cst_historicoCriteria cst_historicoCriteria = new cst_dom.Cst_historicoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//cst_historicoCriteria.idHistorico.eq();
		cst_historicoCriteria.setMaxResults(ROW_COUNT);
		cst_dom.Cst_historico[] cst_domCst_historicos = cst_historicoCriteria.listCst_historico();
		length =cst_domCst_historicos== null ? 0 : Math.min(cst_domCst_historicos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(cst_domCst_historicos[i]);
		}
		System.out.println(length + " Cst_historico record(s) retrieved."); 
		
		System.out.println("Listing Cst_tipo_consulta by Criteria...");
		cst_dom.Cst_tipo_consultaCriteria cst_tipo_consultaCriteria = new cst_dom.Cst_tipo_consultaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//cst_tipo_consultaCriteria.idTipoConsulta.eq();
		cst_tipo_consultaCriteria.setMaxResults(ROW_COUNT);
		cst_dom.Cst_tipo_consulta[] cst_domCst_tipo_consultas = cst_tipo_consultaCriteria.listCst_tipo_consulta();
		length =cst_domCst_tipo_consultas== null ? 0 : Math.min(cst_domCst_tipo_consultas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(cst_domCst_tipo_consultas[i]);
		}
		System.out.println(length + " Cst_tipo_consulta record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListUntitledData listUntitledData = new ListUntitledData();
			try {
				listUntitledData.listTestData();
				//listUntitledData.listByCriteria();
			}
			finally {
				cst_dom.UntitledPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
