package com.ufapeSports.ufapeSports.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "produto", schema = "")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Produto {
	@Id
	@Column(name = "produtoID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long produtoID;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "preco")
	private float preco;
	
	@Column(name = "estoque")
	private String estoque;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "peso")
	private String peso;
	
	@Column(name = "cor")
	private String cor;
}
