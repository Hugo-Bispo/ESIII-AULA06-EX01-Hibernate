package model;

import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "atendimento")
public class Atendimento {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "id_atendente")
	@NotNull
	private Atendente atendente;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "cpf")
	@NotNull
	private Cliente cliente;
	
	@Id
	@Column(name = "data_hora")
	@NotNull
	private LocalDate data_hora;
	
	public Atendente getId_atendente() {
		return atendente;
	}
	public void setId_atendente(Atendente atendente) {
		this.atendente = atendente;
	}
	public Cliente getId_cliente() {
		return cliente;
	}
	public void setId_cliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public LocalDate getData_hora() {
		return data_hora;
	}
	public void setData_hora(LocalDate data_hora) {
		this.data_hora = data_hora;
	}
	
	@Override
	public String toString() {
		return "Atendimento [id_atendente=" + atendente + ", id_funcionario=" + cliente + ", data_hora="
				+ data_hora + "]";
	}
	

}
