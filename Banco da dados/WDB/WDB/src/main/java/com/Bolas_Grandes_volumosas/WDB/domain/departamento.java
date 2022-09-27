package com.Bolas_Grandes_volumosas.WDB.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class departamento implements Serializable   {
    @Id // para usar uma chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para fazer ele usar alto encremento
    private Integer id_depto; // Chave primaria para DepartamentoRespository
    @NotEmpty(message = "essa coisa não pode ser fazil") //esta dizendo que o nm_depto não pode ser fazio
    @Length(min = 5, max = 10,message = "coloca menos caoisas ") // estou colocando um valor maximo e minimo que pode ser escrito
    private String  nm_depto;
    public departamento(Integer id_depto, String nm_depto) {
        setId_depto(id_depto);
        setNm_depto(nm_depto);
    }
    
    public Integer getId_depto() {
        return id_depto;
    }
    public void setId_depto(Integer id_depto) {       
        this.id_depto = id_depto;
    }
    public String getNm_depto() {
        return nm_depto;
    }
    public void setNm_depto(String nm_depto) {        
        this.nm_depto = nm_depto;
    }
        
}
