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

public class Cst_usuario {
	public Cst_usuario() {
	}
	
	private int idUsuario;
	
	private cst_dom.Cst_rol cst_rolidRol;
	
	private String user;
	
	private String password;
	
	private cst_dom.Cst_historico cst_historico;
	
	private void setIdUsuario(int value) {
		this.idUsuario = value;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public int getORMID() {
		return getIdUsuario();
	}
	
	public void setUser(String value) {
		this.user = value;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setCst_rolidRol(cst_dom.Cst_rol value) {
		if (this.cst_rolidRol != value) {
			cst_dom.Cst_rol lcst_rolidRol = this.cst_rolidRol;
			this.cst_rolidRol = value;
			if (value != null) {
				cst_rolidRol.setCst_usuario(this);
			}
			else {
				lcst_rolidRol.setCst_usuario(null);
			}
		}
	}
	
	public cst_dom.Cst_rol getCst_rolidRol() {
		return cst_rolidRol;
	}
	
	public void setCst_historico(cst_dom.Cst_historico value) {
		if (this.cst_historico != value) {
			cst_dom.Cst_historico lcst_historico = this.cst_historico;
			this.cst_historico = value;
			if (value != null) {
				cst_historico.setCst_usuarioidUsuario(this);
			}
			else {
				lcst_historico.setCst_usuarioidUsuario(null);
			}
		}
	}
	
	public cst_dom.Cst_historico getCst_historico() {
		return cst_historico;
	}
	
	public String toString() {
		return String.valueOf(getIdUsuario());
	}
	
}
