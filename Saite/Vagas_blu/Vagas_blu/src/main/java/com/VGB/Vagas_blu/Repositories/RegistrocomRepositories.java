package com.VGB.Vagas_blu.Repositories;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.VGB.Vagas_blu.Domain.RegistroComplementar;



@Repository
public interface RegistrocomRepositories extends JpaRepository<RegistroComplementar,Integer>{
    @Query("SELECT rc FROM RegistroComplementar rc WHERE rc.id_Pessoa_pai.id_Pessoa = :pPessoa ORDER BY Id_complemtar")
    List<RegistroComplementar> fiandAllbyPessoa(@Param(value = "pPessoa") Integer pPessoa);
}
