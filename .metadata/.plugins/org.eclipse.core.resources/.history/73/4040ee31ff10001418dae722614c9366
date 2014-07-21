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

public class Cst_tipo_consultaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idTipoConsulta;
	public final StringExpression desc_consulta;
	
	public Cst_tipo_consultaCriteria(Criteria criteria) {
		super(criteria);
		idTipoConsulta = new IntegerExpression("idTipoConsulta", this);
		desc_consulta = new StringExpression("desc_consulta", this);
	}
	
	public Cst_tipo_consultaCriteria(PersistentSession session) {
		this(session.createCriteria(Cst_tipo_consulta.class));
	}
	
	public Cst_tipo_consultaCriteria() throws PersistentException {
		this(cst_dom.UntitledPersistentManager.instance().getSession());
	}
	
	public Cst_historicoCriteria createCst_historicoCriteria() {
		return new Cst_historicoCriteria(createCriteria("cst_historico"));
	}
	
	public Cst_tipo_consulta uniqueCst_tipo_consulta() {
		return (Cst_tipo_consulta) super.uniqueResult();
	}
	
	public Cst_tipo_consulta[] listCst_tipo_consulta() {
		java.util.List list = super.list();
		return (Cst_tipo_consulta[]) list.toArray(new Cst_tipo_consulta[list.size()]);
	}
}

