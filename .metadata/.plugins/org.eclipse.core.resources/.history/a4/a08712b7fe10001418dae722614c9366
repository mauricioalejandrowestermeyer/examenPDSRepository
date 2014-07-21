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

public class Cst_rolDAO {
	public static Cst_rol loadCst_rolByORMID(int idRol) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_rolByORMID(session, idRol);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol getCst_rolByORMID(int idRol) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return getCst_rolByORMID(session, idRol);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol loadCst_rolByORMID(int idRol, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_rolByORMID(session, idRol, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol getCst_rolByORMID(int idRol, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return getCst_rolByORMID(session, idRol, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol loadCst_rolByORMID(PersistentSession session, int idRol) throws PersistentException {
		try {
			return (Cst_rol) session.load(cst_dom.Cst_rol.class, new Integer(idRol));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol getCst_rolByORMID(PersistentSession session, int idRol) throws PersistentException {
		try {
			return (Cst_rol) session.get(cst_dom.Cst_rol.class, new Integer(idRol));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol loadCst_rolByORMID(PersistentSession session, int idRol, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cst_rol) session.load(cst_dom.Cst_rol.class, new Integer(idRol), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol getCst_rolByORMID(PersistentSession session, int idRol, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cst_rol) session.get(cst_dom.Cst_rol.class, new Integer(idRol), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol[] listCst_rolByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return listCst_rolByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol[] listCst_rolByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return listCst_rolByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol[] listCst_rolByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_rol as Cst_rol");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Cst_rol[]) list.toArray(new Cst_rol[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol[] listCst_rolByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_rol as Cst_rol");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Cst_rol[]) list.toArray(new Cst_rol[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol loadCst_rolByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_rolByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol loadCst_rolByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_rolByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol loadCst_rolByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cst_rol[] cst_rols = listCst_rolByQuery(session, condition, orderBy);
		if (cst_rols != null && cst_rols.length > 0)
			return cst_rols[0];
		else
			return null;
	}
	
	public static Cst_rol loadCst_rolByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cst_rol[] cst_rols = listCst_rolByQuery(session, condition, orderBy, lockMode);
		if (cst_rols != null && cst_rols.length > 0)
			return cst_rols[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCst_rolByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return iterateCst_rolByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCst_rolByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return iterateCst_rolByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCst_rolByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_rol as Cst_rol");
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
	
	public static java.util.Iterator iterateCst_rolByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_rol as Cst_rol");
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
	
	public static Cst_rol createCst_rol() {
		return new cst_dom.Cst_rol();
	}
	
	public static boolean save(cst_dom.Cst_rol cst_rol) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().saveObject(cst_rol);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(cst_dom.Cst_rol cst_rol) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().deleteObject(cst_rol);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cst_dom.Cst_rol cst_rol)throws PersistentException {
		try {
			if(cst_rol.getCst_usuario() != null) {
				cst_rol.getCst_usuario().setCst_rolidRol(null);
			}
			
			return delete(cst_rol);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cst_dom.Cst_rol cst_rol, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(cst_rol.getCst_usuario() != null) {
				cst_rol.getCst_usuario().setCst_rolidRol(null);
			}
			
			try {
				session.delete(cst_rol);
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
	
	public static boolean refresh(cst_dom.Cst_rol cst_rol) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().getSession().refresh(cst_rol);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(cst_dom.Cst_rol cst_rol) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().getSession().evict(cst_rol);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_rol loadCst_rolByCriteria(Cst_rolCriteria cst_rolCriteria) {
		Cst_rol[] cst_rols = listCst_rolByCriteria(cst_rolCriteria);
		if(cst_rols == null || cst_rols.length == 0) {
			return null;
		}
		return cst_rols[0];
	}
	
	public static Cst_rol[] listCst_rolByCriteria(Cst_rolCriteria cst_rolCriteria) {
		return cst_rolCriteria.listCst_rol();
	}
}
