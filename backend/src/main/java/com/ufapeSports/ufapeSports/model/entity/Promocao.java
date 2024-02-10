package com.ufapeSports.ufapeSports.model.entity;

import java.time.LocalDateTime;

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
@Table(name = "promocao", schema = "")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Promocao {
	@Id
	@Column(name = "promocaoID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long promocaoID;
	
	@Column(name = "dataInicio")
	private LocalDateTime dataInicio;
	
	@Column(name = "dataFim")
	private LocalDateTime dataFim;
	
	@Column(name = "porcentagem")
	private float porcentagem;
	
	@Column(name = "descricao")
	private String descricao;
}
