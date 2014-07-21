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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Cst_usuarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression idUsuario;
	public final StringExpression user;
	public final StringExpression password;
	
	public Cst_usuarioCriteria(Criteria criteria) {
		super(criteria);
		idUsuario = new IntegerExpression("idUsuario", this);
		user = new StringExpression("user", this);
		password = new StringExpression("password", this);
	}
	
	public Cst_usuarioCriteria(PersistentSession session) {
		this(session.createCriteria(Cst_usuario.class));
	}
	
	public Cst_usuarioCriteria() throws PersistentException {
		this(cst_dom.UntitledPersistentManager.instance().getSession());
	}
	
	public Cst_rolCriteria createCst_rolidRolCriteria() {
		return new Cst_rolCriteria(createCriteria("cst_rolidRol"));
	}
	
	public Cst_historicoCriteria createCst_historicoCriteria() {
		return new Cst_historicoCriteria(createCriteria("cst_historico"));
	}
	
	public Cst_usuario uniqueCst_usuario() {
		return (Cst_usuario) super.uniqueResult();
	}
	
	public Cst_usuario[] listCst_usuario() {
		java.util.List list = super.list();
		return (Cst_usuario[]) list.toArray(new Cst_usuario[list.size()]);
	}
}

