package com.Bolas_Grandes_volumosas.WDB.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Funcionario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_funcionario;
    @NotEmpty(message = "campo NM_FUNCIOnARIO não pode ser vazio")
    @Length(min = 3,max = 250,message = "Deu erro")
    private String nm_funcionario;
    public Funcionario(Integer id_funcionario, String nm_funcionario) {
         setId_funcionario(id_funcionario);
         setNm_funcionario(nm_funcionario);
    }
    public Integer getId_funcionario() {
        return id_funcionario;
    }
    public void setId_funcionario(Integer id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
    public String getNm_funcionario() {
        return nm_funcionario;
    }
    public void setNm_funcionario(String nm_funcionario) {
        this.nm_funcionario = nm_funcionario;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_funcionario == null) ? 0 : id_funcionario.hashCode());
        result = prime * result + ((nm_funcionario == null) ? 0 : nm_funcionario.hashCode());
        return result;
    }
    
   
}
