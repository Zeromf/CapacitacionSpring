package es.pildoras.conexionHibernate;

import javax.persistence.*;

@Entity
@Table(name="detalles_cliente")
public class DetallesCliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="web")
	private String web;
	@Column(name="tfno")
	private String tlfno;
	@Column(name="comentarios")
	private String comentarios;
	
	@OneToOne(mappedBy="detallesCliente",cascade=CascadeType.ALL)
	private Cliente elCliente;
	
	public DetallesCliente(){}
	
	
	
	/**
	 * @param web
	 * @param tlfno
	 * @param comentarios
	 */
	public DetallesCliente(String web, String tlfno, String comentarios) {
		this.web = web;
		this.tlfno = tlfno;
		this.comentarios = comentarios;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



	public String getWeb() {
		return web;
	}



	public void setWeb(String web) {
		this.web = web;
	}



	public String getTlfno() {
		return tlfno;
	}



	public void setTlfno(String tlfno) {
		this.tlfno = tlfno;
	}



	public String getComentarios() {
		return comentarios;
	}



	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}



	public Cliente getElCliente() {
		return elCliente;
	}



	public void setElCliente(Cliente elCliente) {
		this.elCliente = elCliente;
	}



	@Override
	public String toString() {
		return "DetallesCliente [id=" + id + ", web=" + web + ", tlfno=" + tlfno + ", comentarios=" + comentarios + "]";
	}

	

	
}
