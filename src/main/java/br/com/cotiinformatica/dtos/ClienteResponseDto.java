package br.com.cotiinformatica.dtos;

import java.util.Date;
import java.util.UUID;

public record ClienteResponseDto(
		UUID id, 				//Id do CLiente
		String nome,			//Nome do Cliente
		String email,			//Email
		String cpf, 			//Cpf
		String telefone, 		//Telefone
		Date dataNascimento		//Data de Nascimento 
		
		) {
		
}
