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

public class Cst_tipo_consultaDAO {
	public static Cst_tipo_consulta loadCst_tipo_consultaByORMID(int idTipoConsulta) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_tipo_consultaByORMID(session, idTipoConsulta);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta getCst_tipo_consultaByORMID(int idTipoConsulta) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return getCst_tipo_consultaByORMID(session, idTipoConsulta);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta loadCst_tipo_consultaByORMID(int idTipoConsulta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_tipo_consultaByORMID(session, idTipoConsulta, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta getCst_tipo_consultaByORMID(int idTipoConsulta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return getCst_tipo_consultaByORMID(session, idTipoConsulta, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta loadCst_tipo_consultaByORMID(PersistentSession session, int idTipoConsulta) throws PersistentException {
		try {
			return (Cst_tipo_consulta) session.load(cst_dom.Cst_tipo_consulta.class, new Integer(idTipoConsulta));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta getCst_tipo_consultaByORMID(PersistentSession session, int idTipoConsulta) throws PersistentException {
		try {
			return (Cst_tipo_consulta) session.get(cst_dom.Cst_tipo_consulta.class, new Integer(idTipoConsulta));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta loadCst_tipo_consultaByORMID(PersistentSession session, int idTipoConsulta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cst_tipo_consulta) session.load(cst_dom.Cst_tipo_consulta.class, new Integer(idTipoConsulta), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta getCst_tipo_consultaByORMID(PersistentSession session, int idTipoConsulta, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cst_tipo_consulta) session.get(cst_dom.Cst_tipo_consulta.class, new Integer(idTipoConsulta), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta[] listCst_tipo_consultaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return listCst_tipo_consultaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta[] listCst_tipo_consultaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return listCst_tipo_consultaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta[] listCst_tipo_consultaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_tipo_consulta as Cst_tipo_consulta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Cst_tipo_consulta[]) list.toArray(new Cst_tipo_consulta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta[] listCst_tipo_consultaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_tipo_consulta as Cst_tipo_consulta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Cst_tipo_consulta[]) list.toArray(new Cst_tipo_consulta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta loadCst_tipo_consultaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_tipo_consultaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta loadCst_tipo_consultaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_tipo_consultaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta loadCst_tipo_consultaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cst_tipo_consulta[] cst_tipo_consultas = listCst_tipo_consultaByQuery(session, condition, orderBy);
		if (cst_tipo_consultas != null && cst_tipo_consultas.length > 0)
			return cst_tipo_consultas[0];
		else
			return null;
	}
	
	public static Cst_tipo_consulta loadCst_tipo_consultaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cst_tipo_consulta[] cst_tipo_consultas = listCst_tipo_consultaByQuery(session, condition, orderBy, lockMode);
		if (cst_tipo_consultas != null && cst_tipo_consultas.length > 0)
			return cst_tipo_consultas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCst_tipo_consultaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return iterateCst_tipo_consultaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCst_tipo_consultaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return iterateCst_tipo_consultaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCst_tipo_consultaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_tipo_consulta as Cst_tipo_consulta");
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
	
	public static java.util.Iterator iterateCst_tipo_consultaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_tipo_consulta as Cst_tipo_consulta");
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
	
	public static Cst_tipo_consulta createCst_tipo_consulta() {
		return new cst_dom.Cst_tipo_consulta();
	}
	
	public static boolean save(cst_dom.Cst_tipo_consulta cst_tipo_consulta) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().saveObject(cst_tipo_consulta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(cst_dom.Cst_tipo_consulta cst_tipo_consulta) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().deleteObject(cst_tipo_consulta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cst_dom.Cst_tipo_consulta cst_tipo_consulta)throws PersistentException {
		try {
			if(cst_tipo_consulta.getCst_historico() != null) {
				cst_tipo_consulta.getCst_historico().setCst_tipo_consultaidTipoConsulta(null);
			}
			
			return delete(cst_tipo_consulta);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cst_dom.Cst_tipo_consulta cst_tipo_consulta, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(cst_tipo_consulta.getCst_historico() != null) {
				cst_tipo_consulta.getCst_historico().setCst_tipo_consultaidTipoConsulta(null);
			}
			
			try {
				session.delete(cst_tipo_consulta);
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
	
	public static boolean refresh(cst_dom.Cst_tipo_consulta cst_tipo_consulta) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().getSession().refresh(cst_tipo_consulta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(cst_dom.Cst_tipo_consulta cst_tipo_consulta) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().getSession().evict(cst_tipo_consulta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_tipo_consulta loadCst_tipo_consultaByCriteria(Cst_tipo_consultaCriteria cst_tipo_consultaCriteria) {
		Cst_tipo_consulta[] cst_tipo_consultas = listCst_tipo_consultaByCriteria(cst_tipo_consultaCriteria);
		if(cst_tipo_consultas == null || cst_tipo_consultas.length == 0) {
			return null;
		}
		return cst_tipo_consultas[0];
	}
	
	public static Cst_tipo_consulta[] listCst_tipo_consultaByCriteria(Cst_tipo_consultaCriteria cst_tipo_consultaCriteria) {
		return cst_tipo_consultaCriteria.listCst_tipo_consulta();
	}
}
