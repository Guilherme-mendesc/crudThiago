package com.crud.lojas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.lojas.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase( String nomeProduto);
	
	
	
}
