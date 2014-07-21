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

public class Cst_usuarioDAO {
	public static Cst_usuario loadCst_usuarioByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_usuarioByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario getCst_usuarioByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return getCst_usuarioByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario loadCst_usuarioByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_usuarioByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario getCst_usuarioByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return getCst_usuarioByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario loadCst_usuarioByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Cst_usuario) session.load(cst_dom.Cst_usuario.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario getCst_usuarioByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Cst_usuario) session.get(cst_dom.Cst_usuario.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario loadCst_usuarioByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cst_usuario) session.load(cst_dom.Cst_usuario.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario getCst_usuarioByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cst_usuario) session.get(cst_dom.Cst_usuario.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario[] listCst_usuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return listCst_usuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario[] listCst_usuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return listCst_usuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario[] listCst_usuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_usuario as Cst_usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Cst_usuario[]) list.toArray(new Cst_usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario[] listCst_usuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_usuario as Cst_usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Cst_usuario[]) list.toArray(new Cst_usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario loadCst_usuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_usuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario loadCst_usuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return loadCst_usuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario loadCst_usuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cst_usuario[] cst_usuarios = listCst_usuarioByQuery(session, condition, orderBy);
		if (cst_usuarios != null && cst_usuarios.length > 0)
			return cst_usuarios[0];
		else
			return null;
	}
	
	public static Cst_usuario loadCst_usuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cst_usuario[] cst_usuarios = listCst_usuarioByQuery(session, condition, orderBy, lockMode);
		if (cst_usuarios != null && cst_usuarios.length > 0)
			return cst_usuarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCst_usuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return iterateCst_usuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCst_usuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = cst_dom.UntitledPersistentManager.instance().getSession();
			return iterateCst_usuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCst_usuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_usuario as Cst_usuario");
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
	
	public static java.util.Iterator iterateCst_usuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From cst_dom.Cst_usuario as Cst_usuario");
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
	
	public static Cst_usuario createCst_usuario() {
		return new cst_dom.Cst_usuario();
	}
	
	public static boolean save(cst_dom.Cst_usuario cst_usuario) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().saveObject(cst_usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(cst_dom.Cst_usuario cst_usuario) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().deleteObject(cst_usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cst_dom.Cst_usuario cst_usuario)throws PersistentException {
		try {
			if(cst_usuario.getCst_rolidRol() != null) {
				cst_usuario.getCst_rolidRol().setCst_usuario(null);
			}
			
			if(cst_usuario.getCst_historico() != null) {
				cst_usuario.getCst_historico().setCst_usuarioidUsuario(null);
			}
			
			return delete(cst_usuario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(cst_dom.Cst_usuario cst_usuario, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(cst_usuario.getCst_rolidRol() != null) {
				cst_usuario.getCst_rolidRol().setCst_usuario(null);
			}
			
			if(cst_usuario.getCst_historico() != null) {
				cst_usuario.getCst_historico().setCst_usuarioidUsuario(null);
			}
			
			try {
				session.delete(cst_usuario);
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
	
	public static boolean refresh(cst_dom.Cst_usuario cst_usuario) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().getSession().refresh(cst_usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(cst_dom.Cst_usuario cst_usuario) throws PersistentException {
		try {
			cst_dom.UntitledPersistentManager.instance().getSession().evict(cst_usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cst_usuario loadCst_usuarioByCriteria(Cst_usuarioCriteria cst_usuarioCriteria) {
		Cst_usuario[] cst_usuarios = listCst_usuarioByCriteria(cst_usuarioCriteria);
		if(cst_usuarios == null || cst_usuarios.length == 0) {
			return null;
		}
		return cst_usuarios[0];
	}
	
	public static Cst_usuario[] listCst_usuarioByCriteria(Cst_usuarioCriteria cst_usuarioCriteria) {
		return cst_usuarioCriteria.listCst_usuario();
	}
}
