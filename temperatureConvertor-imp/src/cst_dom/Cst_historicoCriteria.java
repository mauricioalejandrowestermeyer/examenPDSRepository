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

public class Cst_historicoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idHistorico;
	public final TimeExpression fecha;
	
	public Cst_historicoCriteria(Criteria criteria) {
		super(criteria);
		idHistorico = new IntegerExpression("idHistorico", this);
		fecha = new TimeExpression("fecha", this);
	}
	
	public Cst_historicoCriteria(PersistentSession session) {
		this(session.createCriteria(Cst_historico.class));
	}
	
	public Cst_historicoCriteria() throws PersistentException {
		this(cst_dom.UntitledPersistentManager.instance().getSession());
	}
	
	public Cst_tipo_consultaCriteria createCst_tipo_consultaidTipoConsultaCriteria() {
		return new Cst_tipo_consultaCriteria(createCriteria("cst_tipo_consultaidTipoConsulta"));
	}
	
	public Cst_usuarioCriteria createCst_usuarioidUsuarioCriteria() {
		return new Cst_usuarioCriteria(createCriteria("cst_usuarioidUsuario"));
	}
	
	public Cst_historico uniqueCst_historico() {
		return (Cst_historico) super.uniqueResult();
	}
	
	public Cst_historico[] listCst_historico() {
		java.util.List list = super.list();
		return (Cst_historico[]) list.toArray(new Cst_historico[list.size()]);
	}
}

