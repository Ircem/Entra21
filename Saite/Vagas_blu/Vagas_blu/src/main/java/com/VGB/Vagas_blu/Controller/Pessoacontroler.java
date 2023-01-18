package com.VGB.Vagas_blu.Controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.VGB.Vagas_blu.Domain.Pessoa;

import com.VGB.Vagas_blu.Repositories.PessoaRepositories;

import com.VGB.Vagas_blu.Services.PessoaServices;
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/Pessoa")
public class Pessoacontroler {
    
    @Autowired
    private PessoaRepositories psRespositorio;

    @Autowired
    private PessoaServices pServices;

    

    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll() {
        List<Pessoa> pessoa =  (List<Pessoa>) psRespositorio.findAll();
        return ResponseEntity.ok().body(pessoa);

    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Pessoa>> findAll(@PathVariable Integer id ) {
        Optional<Pessoa> pessoa = psRespositorio.findById(id);
        return ResponseEntity.ok().body(pessoa);
    }

    
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delDepartamento(@PathVariable Integer id) {
        pServices.delPessoa(id);
        return ResponseEntity.noContent().build();
    }
    
    @PostMapping
    public ResponseEntity<Pessoa> insDepto(@Valid  @RequestBody Pessoa pPessoa) {
        pPessoa.setId_Pessoa(null);
        psRespositorio.save(pPessoa);
        URI vURI = ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(pPessoa.getId_Pessoa()).toUri();
        return ResponseEntity.created(vURI).body(pPessoa);

    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Pessoa> updDepto(@Valid @PathVariable  Integer id,@RequestBody Pessoa pPessoa) {
        Pessoa atualPessoa = psRespositorio.findById(id).orElseThrow(
                () -> new ObjectNotFoundException(id, "deu erro"));
                atualPessoa.setNm_Pessoa(pPessoa.getNm_Pessoa());
                atualPessoa.setSn_Pessoa(pPessoa.getSn_Pessoa());
                atualPessoa.setEm_Pessoa(pPessoa.getEm_Pessoa());
                atualPessoa.setSenha_Pessoa(pPessoa.getSenha_Pessoa());
                atualPessoa.setIda_Pessoa(pPessoa.getIda_Pessoa());
                psRespositorio.save(atualPessoa);
        return ResponseEntity.ok().body(atualPessoa);
    }
    
}
