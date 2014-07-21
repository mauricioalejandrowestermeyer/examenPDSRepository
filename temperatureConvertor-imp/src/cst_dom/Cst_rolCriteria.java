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

public class Cst_rolCriteria extends AbstractORMCriteria {
	public final IntegerExpression idRol;
	public final IntegerExpression cod_rol;
	public final StringExpression desc_rol;
	
	public Cst_rolCriteria(Criteria criteria) {
		super(criteria);
		idRol = new IntegerExpression("idRol", this);
		cod_rol = new IntegerExpression("cod_rol", this);
		desc_rol = new StringExpression("desc_rol", this);
	}
	
	public Cst_rolCriteria(PersistentSession session) {
		this(session.createCriteria(Cst_rol.class));
	}
	
	public Cst_rolCriteria() throws PersistentException {
		this(cst_dom.UntitledPersistentManager.instance().getSession());
	}
	
	public Cst_usuarioCriteria createCst_usuarioCriteria() {
		return new Cst_usuarioCriteria(createCriteria("cst_usuario"));
	}
	
	public Cst_rol uniqueCst_rol() {
		return (Cst_rol) super.uniqueResult();
	}
	
	public Cst_rol[] listCst_rol() {
		java.util.List list = super.list();
		return (Cst_rol[]) list.toArray(new Cst_rol[list.size()]);
	}
}

