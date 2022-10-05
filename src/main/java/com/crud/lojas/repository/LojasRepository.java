package com.crud.lojas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.lojas.model.Lojas;


@Repository
public interface LojasRepository extends JpaRepository<Lojas, Long> {
	
	public List<Lojas> findAllByNomeContainingIgnoreCase (String nome);

}
