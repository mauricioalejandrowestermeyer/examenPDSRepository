/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package cst_dom;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class Cst_historicoDAO {
	public static Cst_historico loadCst_historicoByORMID(int idHistorico) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_historicoByORMID(session, idHistorico);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico getCst_historicoByORMID(int idHistorico) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return getCst_historicoByORMID(session, idHistorico);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico loadCst_historicoByORMID(int idHistorico, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_historicoByORMID(session, idHistorico, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico getCst_historicoByORMID(int idHistorico, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return getCst_historicoByORMID(session, idHistorico, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico loadCst_historicoByORMID(PersistentSession session, int idHistorico) throws PersistentException {
		try {
			return (Cst_historico) session.load(cst_dom.Cst_historico.class, new Integer(idHistorico));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico getCst_historicoByORMID(PersistentSession session, int idHistorico) throws PersistentException {
		try {
			return (Cst_historico) session.get(cst_dom.Cst_historico.class, new Integer(idHistorico));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico loadCst_historicoByORMID(PersistentSession session, int idHistorico, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cst_historico) session.load(cst_dom.Cst_historico.class, new Integer(idHistorico), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico getCst_historicoByORMID(PersistentSession session, int idHistorico, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cst_historico) session.get(cst_dom.Cst_historico.class, new Integer(idHistorico), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico[] listCst_historicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return listCst_historicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico[] listCst_historicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return listCst_historicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico[] listCst_historicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_historico as Cst_historico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Cst_historico[]) list.toArray(new Cst_historico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico[] listCst_historicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_historico as Cst_historico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Cst_historico[]) list.toArray(new Cst_historico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico loadCst_historicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_historicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico loadCst_historicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_historicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico loadCst_historicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cst_historico[] cst_historicos = listCst_historicoByQuery(session, condition, orderBy);
		if (cst_historicos != null && cst_historicos.length > 0)
			return cst_historicos[0];
		else
			return null;
	}
	
	public static Cst_historico loadCst_historicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cst_historico[] cst_historicos = listCst_historicoByQuery(session, condition, orderBy, lockMode);
		if (cst_historicos != null && cst_historicos.length > 0)
			return cst_historicos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCst_historicoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return iterateCst_historicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCst_historicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return iterateCst_historicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCst_historicoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_historico as Cst_historico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCst_historicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_historico as Cst_historico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico createCst_historico() {
		return new cst_dom.Cst_historico();
	}
	
	public static boolean save(cst_dom.Cst_historico cst_historico) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().saveObject(cst_historico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(cst_dom.Cst_historico cst_historico) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().deleteObject(cst_historico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cst_dom.Cst_historico cst_historico)throws PersistentException {
		try {
			if(cst_historico.getCst_tipo_consultaidTipoConsulta() != null) {
				cst_historico.getCst_tipo_consultaidTipoConsulta().setCst_historico(null);
			}
			
			if(cst_historico.getCst_usuarioidUsuario() != null) {
				cst_historico.getCst_usuarioidUsuario().setCst_historico(null);
			}
			
			return delete(cst_historico);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cst_dom.Cst_historico cst_historico, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(cst_historico.getCst_tipo_consultaidTipoConsulta() != null) {
				cst_historico.getCst_tipo_consultaidTipoConsulta().setCst_historico(null);
			}
			
			if(cst_historico.getCst_usuarioidUsuario() != null) {
				cst_historico.getCst_usuarioidUsuario().setCst_historico(null);
			}
			
			try {
				session.delete(cst_historico);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(cst_dom.Cst_historico cst_historico) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().getSession().refresh(cst_historico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(cst_dom.Cst_historico cst_historico) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().getSession().evict(cst_historico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_historico loadCst_historicoByCriteria(Cst_historicoCriteria cst_historicoCriteria) {
		Cst_historico[] cst_historicos = listCst_historicoByCriteria(cst_historicoCriteria);
		if(cst_historicos == null || cst_historicos.length == 0) {
			return null;
		}
		return cst_historicos[0];
	}
	
	public static Cst_historico[] listCst_historicoByCriteria(Cst_historicoCriteria cst_historicoCriteria) {
		return cst_historicoCriteria.listCst_historico();
	}
}
