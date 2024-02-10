package com.ufapeSports.ufapeSports.model.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "endereco", schema = "")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Endereco {
	@Id
	@Column(name = "enderecoID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long enderecoID;
	
	@OneToMany(mappedBy = "endereco")
	private List<Cliente> clientes;
	
	@Column(name = "cep")
	private String cep;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "logradouro")
	private String logradouro;
	
	@Column(name = "bairro")
	private String bairro;
	
}
