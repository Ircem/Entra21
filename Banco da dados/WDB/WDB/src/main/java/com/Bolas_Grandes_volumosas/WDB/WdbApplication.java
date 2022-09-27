package com.Bolas_Grandes_volumosas.WDB;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.Bolas_Grandes_volumosas.WDB.domain.Funcionario;
import com.Bolas_Grandes_volumosas.WDB.domain.departamento;
import com.Bolas_Grandes_volumosas.WDB.repositories.DepartamentoRespository;
import com.Bolas_Grandes_volumosas.WDB.repositories.FuncionarioRespository;

@SpringBootApplication
public class WdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(WdbApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(DepartamentoRespository deptoRep) {
		return (args) -> {
			deptoRep.save(new departamento(null, "produção"));
			deptoRep.save(new departamento(null, "fiação"));
			//deptoRep.save(new departamento(null, null));
			//deptoRep.save(new departamento(null, "WIlli"));
		};
	}
	@Bean
	public CommandLineRunner demo2(FuncionarioRespository funtoRep) {
		return (args) -> {
			funtoRep.save(new Funcionario(null, "Bruno"));
			
			
		};
	}

}
