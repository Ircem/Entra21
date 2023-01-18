package com.VGB.Vagas_blu.Domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class RegistroComplementar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_complemtar;

    public RegistroComplementar() {

    }

    @NotEmpty(message = "campo mr_carro não pode ser vazio")
    @Length(min = 1, max = 250, message = "Erro")
    private String mr_carro;

    @NotEmpty(message = "campo pl_carro não pode ser vazio")
    @Length(min = 1, max = 250, message = "Erro")
    private String pl_carro;

    @NotEmpty(message = "campo ano_carro não pode ser vazio")
    @Length(min = 1, max = 250, message = "Erro")
    private String ano_carro;
        
    @ManyToOne
    @JoinColumn(name = "id_Pessoa", updatable = false)
    private Pessoa id_Pessoa_pai;
    
    public RegistroComplementar(Integer id_complemtar, String mr_carro, String pl_carro, String ano_carro, Integer inm_pesso,
    Pessoa id_Pessoa_pai) {
        setId_complemtar(id_complemtar);
        setMr_carro(mr_carro);
        setPl_carro(pl_carro);
        setAno_carro(ano_carro);
        setId_Pessoa(id_Pessoa_pai);
    }
    
    public Integer getId_complemtar() {
        return Id_complemtar;
    }
    
    public void setId_complemtar(Integer id_complemtar) {
        Id_complemtar = id_complemtar;
    }
    
    public String getMr_carro() {
        return mr_carro;
    }

    public void setMr_carro(String mr_carro) {
        this.mr_carro = mr_carro;
    }

    public String getPl_carro() {
        return pl_carro;
    }

    public void setPl_carro(String pl_carro) {
        this.pl_carro = pl_carro;
    }

    public String getAno_carro() {
        return ano_carro;
    }

    public void setAno_carro(String ano_carro) {
        this.ano_carro = ano_carro;
    }   
   
    public Pessoa getId_Pessoa() {
        return id_Pessoa_pai;
    }
    
    public void setId_Pessoa(Pessoa id_Pessoa_pai) {
        this.id_Pessoa_pai = id_Pessoa_pai;
    }
    
}
