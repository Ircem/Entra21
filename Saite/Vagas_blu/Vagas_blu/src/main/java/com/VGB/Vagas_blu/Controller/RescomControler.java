package com.VGB.Vagas_blu.Controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.VGB.Vagas_blu.Domain.Pessoa;
import com.VGB.Vagas_blu.Domain.RegistroComplementar;
import com.VGB.Vagas_blu.Repositories.PessoaRepositories;
import com.VGB.Vagas_blu.Repositories.RegistrocomRepositories;
import com.VGB.Vagas_blu.Services.RescomServices;
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/RegistroComplementar")
public class RescomControler {
    @Autowired
    private RescomServices rcservices;

    @Autowired
    private RegistrocomRepositories RCRepositorio;

    @Autowired
    private PessoaRepositories pRepositories;
    
    @GetMapping
    public ResponseEntity<List<RegistroComplementar>> fiandAll(){
        List<RegistroComplementar> Recom = RCRepositorio.findAll();
        return ResponseEntity.ok().body(Recom);
    }

    @GetMapping(value = "/{id}/Pessoa")
    public ResponseEntity<List<RegistroComplementar>> fiandAllbyPessoa(@PathVariable Integer id){
        List<RegistroComplementar> rComplementars = RCRepositorio.fiandAllbyPessoa(id);
        return ResponseEntity.ok().body(rComplementars);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<RegistroComplementar> findByid(@PathVariable Integer id){
        RegistroComplementar Recom = rcservices.findByid(id);
        return ResponseEntity.ok().body(Recom);
    }
    @PostMapping(value = "/{id_Pessoa}")
    public ResponseEntity<RegistroComplementar> insDepto(@Valid @PathVariable Integer id_Pessoa, @Valid  @RequestBody RegistroComplementar pRComplementar) {
        pRComplementar.setId_complemtar(null);
        Pessoa pessoa = pRepositories.findById(id_Pessoa).orElseThrow(null);
        pRComplementar.setId_Pessoa(pessoa);
        RCRepositorio.save(pRComplementar);
        URI vURI = ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(pRComplementar.getId_Pessoa()).toUri();
        return ResponseEntity.created(vURI).body(pRComplementar);

    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<RegistroComplementar> updDepto(@Valid @PathVariable  Integer id,@RequestBody RegistroComplementar pRComplementar) {
        RegistroComplementar atualRComplementar = RCRepositorio.findById(id).orElseThrow(
                () -> new ObjectNotFoundException(id, "deu erro"));
                atualRComplementar.setMr_carro(pRComplementar.getMr_carro());
                atualRComplementar.setPl_carro(pRComplementar.getPl_carro());
                atualRComplementar.setAno_carro(pRComplementar.getAno_carro());
                atualRComplementar.setId_Pessoa(pRComplementar.getId_Pessoa());                
                RCRepositorio.save(atualRComplementar);
        return ResponseEntity.ok().body(atualRComplementar);
    }
}

