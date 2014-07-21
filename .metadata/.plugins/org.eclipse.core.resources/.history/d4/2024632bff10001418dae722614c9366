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

public class Cst_temperaturaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idTemperatura;
	public final IntegerExpression key;
	public final DoubleExpression conversion;
	
	public Cst_temperaturaDetachedCriteria() {
		super(cst_dom.Cst_temperatura.class, cst_dom.Cst_temperaturaCriteria.class);
		idTemperatura = new IntegerExpression("idTemperatura", this.getDetachedCriteria());
		key = new IntegerExpression("key", this.getDetachedCriteria());
		conversion = new DoubleExpression("conversion", this.getDetachedCriteria());
	}
	
	public Cst_temperaturaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, cst_dom.Cst_temperaturaCriteria.class);
		idTemperatura = new IntegerExpression("idTemperatura", this.getDetachedCriteria());
		key = new IntegerExpression("key", this.getDetachedCriteria());
		conversion = new DoubleExpression("conversion", this.getDetachedCriteria());
	}
	
	public Cst_temperatura uniqueCst_temperatura(PersistentSession session) {
		return (Cst_temperatura) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cst_temperatura[] listCst_temperatura(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cst_temperatura[]) list.toArray(new Cst_temperatura[list.size()]);
	}
}

