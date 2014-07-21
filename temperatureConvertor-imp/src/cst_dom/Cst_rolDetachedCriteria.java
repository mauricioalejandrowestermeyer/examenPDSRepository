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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Cst_rolDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idRol;
	public final IntegerExpression cod_rol;
	public final StringExpression desc_rol;
	
	public Cst_rolDetachedCriteria() {
		super(cst_dom.Cst_rol.class, cst_dom.Cst_rolCriteria.class);
		idRol = new IntegerExpression("idRol", this.getDetachedCriteria());
		cod_rol = new IntegerExpression("cod_rol", this.getDetachedCriteria());
		desc_rol = new StringExpression("desc_rol", this.getDetachedCriteria());
	}
	
	public Cst_rolDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, cst_dom.Cst_rolCriteria.class);
		idRol = new IntegerExpression("idRol", this.getDetachedCriteria());
		cod_rol = new IntegerExpression("cod_rol", this.getDetachedCriteria());
		desc_rol = new StringExpression("desc_rol", this.getDetachedCriteria());
	}
	
	public Cst_usuarioDetachedCriteria createCst_usuarioCriteria() {
		return new Cst_usuarioDetachedCriteria(createCriteria("cst_usuario"));
	}
	
	public Cst_rol uniqueCst_rol(PersistentSession session) {
		return (Cst_rol) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cst_rol[] listCst_rol(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cst_rol[]) list.toArray(new Cst_rol[list.size()]);
	}
}

