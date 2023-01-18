package com.VGB.Vagas_blu.Domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Pessoa;
    @NotEmpty(message = "campo nm_Pessoa não pode ser vazio")
    @Length(min = 1, max = 250, message = "Erro")
    private String nm_Pessoa;
    @NotEmpty(message = "campo st_Pessoa não pode ser vazio")
    @Length(min = 1, max = 250, message = "Erro")
    private String sn_Pessoa;
    @NotEmpty(message = "campo em_Pessoa não pode ser vazio")
    @Length(min = 1, max = 250, message = "Erro")
    private String em_Pessoa;
    @NotEmpty(message = "campo senha_Pessoa não pode ser vazio")
    @Length(min = 1, max = 250, message = "Erro")
    private String senha_Pessoa;
    @NotEmpty(message = "campo senha_Pessoa não pode ser vazio")
    @Length(message = "erro nome")
    private String ida_Pessoa;
   

    @OneToMany(mappedBy = "id_Pessoa_pai")
    private List<RegistroComplementar> rescom = new ArrayList<>();

    

    public Pessoa() {

    }

    public Pessoa(Integer id_Pessoa, String nm_Pessoa, String sn_Pessoa, String em_Pessoa, String senha_Pessoa, String ida_Pessoa) {
           
        setId_Pessoa(id_Pessoa); 
        setNm_Pessoa(nm_Pessoa);
        setSn_Pessoa(sn_Pessoa);
        setEm_Pessoa(em_Pessoa);
        setSenha_Pessoa(senha_Pessoa);
        setIda_Pessoa(ida_Pessoa);
    }

    public Integer getId_Pessoa() {
        return id_Pessoa;
    }

    public void setId_Pessoa(Integer id_Pessoa) {
        this.id_Pessoa = id_Pessoa;
    }

    public String getNm_Pessoa() {
        return nm_Pessoa;
    }

    public void setNm_Pessoa(String nm_Pessoa) {
        this.nm_Pessoa = nm_Pessoa;
    }

    public String getSn_Pessoa() {
        return sn_Pessoa;
    }

    public void setSn_Pessoa(String sn_Pessoa) {
        this.sn_Pessoa = sn_Pessoa;
    }

    public String getEm_Pessoa() {
        return em_Pessoa;
    }

    public void setEm_Pessoa(String em_Pessoa) {
        this.em_Pessoa = em_Pessoa;
    }

    public String getSenha_Pessoa() {
        return senha_Pessoa;
    }

    public void setSenha_Pessoa(String senha_Pessoa) {
        this.senha_Pessoa = senha_Pessoa;
    }

    public String getIda_Pessoa() {
        return ida_Pessoa;
    }

    public void setIda_Pessoa(String ida_Pessoa) {
        this.ida_Pessoa = ida_Pessoa;
    }
    

}
