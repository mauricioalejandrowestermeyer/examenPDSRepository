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

public class Cst_usuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idUsuario;
	public final StringExpression user;
	public final StringExpression password;
	
	public Cst_usuarioDetachedCriteria() {
		super(cst_dom.Cst_usuario.class, cst_dom.Cst_usuarioCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		user = new StringExpression("user", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public Cst_usuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, cst_dom.Cst_usuarioCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		user = new StringExpression("user", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public Cst_rolDetachedCriteria createCst_rolidRolCriteria() {
		return new Cst_rolDetachedCriteria(createCriteria("cst_rolidRol"));
	}
	
	public Cst_historicoDetachedCriteria createCst_historicoCriteria() {
		return new Cst_historicoDetachedCriteria(createCriteria("cst_historico"));
	}
	
	public Cst_usuario uniqueCst_usuario(PersistentSession session) {
		return (Cst_usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cst_usuario[] listCst_usuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cst_usuario[]) list.toArray(new Cst_usuario[list.size()]);
	}
}

