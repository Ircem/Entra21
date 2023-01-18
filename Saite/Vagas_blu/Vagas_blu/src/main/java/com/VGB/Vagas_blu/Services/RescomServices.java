package com.VGB.Vagas_blu.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VGB.Vagas_blu.Domain.RegistroComplementar;
import com.VGB.Vagas_blu.Repositories.RegistrocomRepositories;
@Service
public class RescomServices {
    @Autowired
    private RegistrocomRepositories rcRespository;

    public List<RegistroComplementar> findAll(){
        return rcRespository.findAll();
    }
    public RegistroComplementar findByid(Integer id) {
        Optional<RegistroComplementar> Recom = rcRespository.findById(id);
        return Recom.orElseThrow(() -> new ObjctNotFound("OBJ não encontrado id: " + id + ",Tipo: "+ RegistroComplementar.class.getName()));
              
                
            
            
    }
}
