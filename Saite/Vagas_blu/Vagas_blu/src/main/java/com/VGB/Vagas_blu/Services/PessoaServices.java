package com.VGB.Vagas_blu.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VGB.Vagas_blu.Repositories.PessoaRepositories;

@Service
public class PessoaServices {
    @Autowired
    PessoaRepositories psRespository;
    

               
            
            
    

    public void delPessoa(Integer pId){
        try {
            psRespository.deleteById(pId);
        } catch (org.springframework.dao.DataIntegrityViolationException e) {
            throw new com.VGB.Vagas_blu.Exeception.DataintegrityVioltionException("Erro");
        }
    }
}

