package es.pildoras.conexionHibernate;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="FECHA")
	private GregorianCalendar fecha;
	@Column(name="FORMA_PAGO")
	private String formaPago;
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="CLIENTE_ID")
	private Cliente cliente;
	
	
	public Pedido() {}

	
		/**
	 * @param fecha
	 * @param formaPago
	 * @param cliente
	 */
	public Pedido(GregorianCalendar fecha, String formaPago, Cliente cliente) {
		this.fecha = fecha;
		this.formaPago = formaPago;
		this.cliente = cliente;
	}
	public Pedido(GregorianCalendar fecha) {
		this.fecha = fecha;

	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fecha=" + fecha + ", formaPago=" + formaPago + ", cliente=" + cliente + "]";
	}
	
	
	
	
	
	
}
