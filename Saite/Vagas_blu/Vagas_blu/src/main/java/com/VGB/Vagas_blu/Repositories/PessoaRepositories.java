package com.VGB.Vagas_blu.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VGB.Vagas_blu.Domain.Pessoa;

@Repository
public interface PessoaRepositories extends JpaRepository<Pessoa,Integer>{


}
