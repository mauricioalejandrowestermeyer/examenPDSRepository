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

public class Cst_temperaturaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idTemperatura;
	public final IntegerExpression key;
	public final DoubleExpression conversion;
	
	public Cst_temperaturaCriteria(Criteria criteria) {
		super(criteria);
		idTemperatura = new IntegerExpression("idTemperatura", this);
		key = new IntegerExpression("key", this);
		conversion = new DoubleExpression("conversion", this);
	}
	
	public Cst_temperaturaCriteria(PersistentSession session) {
		this(session.createCriteria(Cst_temperatura.class));
	}
	
	public Cst_temperaturaCriteria() throws PersistentException {
		this(cst_dom.UntitledPersistentManager.instance().getSession());
	}
	
	public Cst_temperatura uniqueCst_temperatura() {
		return (Cst_temperatura) super.uniqueResult();
	}
	
	public Cst_temperatura[] listCst_temperatura() {
		java.util.List list = super.list();
		return (Cst_temperatura[]) list.toArray(new Cst_temperatura[list.size()]);
	}
}

