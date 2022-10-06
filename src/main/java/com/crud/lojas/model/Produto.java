package com.crud.lojas.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nomeProduto;
	
	@NotNull
	private Double preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Lojas lojas;

	private Produto() {
		
	}	
	
	public Produto(long id, String nomeProduto, Double preco, Lojas lojas) {
		
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.lojas = lojas;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Lojas getLojas() {
		return lojas;
	}

	public void setLojas(Lojas lojas) {
		this.lojas = lojas;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nomeProduto=" + nomeProduto + ", preco=" + preco + ", lojas=" + lojas + "]";
	}
	
	
	
	
}


