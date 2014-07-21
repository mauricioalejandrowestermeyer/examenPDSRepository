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

public class Cst_historicoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idHistorico;
	public final TimeExpression fecha;
	
	public Cst_historicoDetachedCriteria() {
		super(cst_dom.Cst_historico.class, cst_dom.Cst_historicoCriteria.class);
		idHistorico = new IntegerExpression("idHistorico", this.getDetachedCriteria());
		fecha = new TimeExpression("fecha", this.getDetachedCriteria());
	}
	
	public Cst_historicoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, cst_dom.Cst_historicoCriteria.class);
		idHistorico = new IntegerExpression("idHistorico", this.getDetachedCriteria());
		fecha = new TimeExpression("fecha", this.getDetachedCriteria());
	}
	
	public Cst_tipo_consultaDetachedCriteria createCst_tipo_consultaidTipoConsultaCriteria() {
		return new Cst_tipo_consultaDetachedCriteria(createCriteria("cst_tipo_consultaidTipoConsulta"));
	}
	
	public Cst_usuarioDetachedCriteria createCst_usuarioidUsuarioCriteria() {
		return new Cst_usuarioDetachedCriteria(createCriteria("cst_usuarioidUsuario"));
	}
	
	public Cst_historico uniqueCst_historico(PersistentSession session) {
		return (Cst_historico) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cst_historico[] listCst_historico(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cst_historico[]) list.toArray(new Cst_historico[list.size()]);
	}
}

