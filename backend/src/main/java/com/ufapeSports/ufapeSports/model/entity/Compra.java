package com.ufapeSports.ufapeSports.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "compra", schema = "")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Compra {
	@Id
	@Column(name = "compraID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long compraId;
	
	@Column(name = "dataDaCompra")
	private LocalDateTime dataDaCompra;
	
	@Column(name = "dataVencCartao")
	private String dataVencCartao;
	
	@Column(name = "nomeTitular")
	private String nomeTitular;
	
	@Column(name = "numeroCartao")
	private String numeroCartao;
	
	@Column(name = "total")
	private String total;
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	public Cliente getCliente() {
		return this.cliente;
	}
}
