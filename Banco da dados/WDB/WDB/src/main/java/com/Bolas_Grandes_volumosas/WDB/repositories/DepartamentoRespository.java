package com.Bolas_Grandes_volumosas.WDB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bolas_Grandes_volumosas.WDB.domain.departamento;

@Repository
public interface DepartamentoRespository extends JpaRepository<departamento, Integer> {
    
}
