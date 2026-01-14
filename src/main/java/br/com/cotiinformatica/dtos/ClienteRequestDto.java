package br.com.cotiinformatica.dtos;

import java.util.Date;

public record ClienteRequestDto(
		String nome,			//Nome do Cliente
		String email,			//Email
		String cpf, 			//Cpf
		String telefone, 		//Telefone
		String dataNascimento		//Data de Nascimento		
		) {

}
