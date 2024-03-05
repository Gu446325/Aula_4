package model;

import java.util.ArrayList;
import java.util.UUID;

public class Banco {
	private String nome_banco;
	private String certificado_autorizacao;
	
	private ArrayList<Usuario> usuarios;
	
	public Banco (String nome) {
		this.nome_banco = nome;
		this.certificado_autorizacao = UUID.randomUUID().toString();
	}
	
	public String CriarUsuario(String nome, String Cpf, String Email,
			String Celular, String Senha) {
		Usuario usuarioNovo = new Usuario (nome,Cpf,Email,Celular,Senha);
		usuarios.add(usuarioNovo);
		return "Usuario Cadastrado com Sucesso";
	}
	public String getBanco() {
		return (
		"\nNome do Banco: " this.nome_banco
		+"\nCertificado: "+ this.certificado_autorizacao
		);
				
	}
}

 