/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteUntitledData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = cst_dom.UntitledPersistentManager.instance().getSession().beginTransaction();
		try {
			cst_dom.Cst_temperatura lcst_domCst_temperatura = cst_dom.Cst_temperaturaDAO.loadCst_temperaturaByQuery(null, null);
			// Delete the persistent object
			cst_dom.Cst_temperaturaDAO.delete(lcst_domCst_temperatura);
			cst_dom.Cst_usuario lcst_domCst_usuario = cst_dom.Cst_usuarioDAO.loadCst_usuarioByQuery(null, null);
			// Delete the persistent object
			cst_dom.Cst_usuarioDAO.delete(lcst_domCst_usuario);
			cst_dom.Cst_rol lcst_domCst_rol = cst_dom.Cst_rolDAO.loadCst_rolByQuery(null, null);
			// Delete the persistent object
			cst_dom.Cst_rolDAO.delete(lcst_domCst_rol);
			cst_dom.Cst_historico lcst_domCst_historico = cst_dom.Cst_historicoDAO.loadCst_historicoByQuery(null, null);
			// Delete the persistent object
			cst_dom.Cst_historicoDAO.delete(lcst_domCst_historico);
			cst_dom.Cst_tipo_consulta lcst_domCst_tipo_consulta = cst_dom.Cst_tipo_consultaDAO.loadCst_tipo_consultaByQuery(null, null);
			// Delete the persistent object
			cst_dom.Cst_tipo_consultaDAO.delete(lcst_domCst_tipo_consulta);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteUntitledData deleteUntitledData = new DeleteUntitledData();
			try {
				deleteUntitledData.deleteTestData();
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
