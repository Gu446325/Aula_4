package app;

import model.Banco;
import model.Usuario;
import view.Mensagens;

public class Main {
	
	public static void main (String[] args) {
		Mensagens mensagem = new Mensagens();
		
		String Nome, CPF, Celular, Email, Senha;
		String opcao = null;
		int OpcaoNum;
		
		do {
			mensagem.solicitarEntrada("Sistema Bancário"
					+"\nDigite a opção desejada"
					+"\n1. Cadastrar Banco"
					+"\n2. Cadastrar Usuário"
					+"\n3. Sair"
					);
			
					OpcaoNum = Integer.parseInt(opcao);
					switch(OpcaoNum) {
					case 1:
						String nomeBanco;
						nomeBanco = mensagem.solicitarEntrada
								("Digite o Nome do Banco");
						Banco novoBanco = new Banco(nomeBanco);
						mensagem.mostrarMensagemDeSucesso("Banco Cadastrado com Sucesso"
								+ novoBanco.getBanco()
								);
						break;
						
				case 2:
					Nome = mensagem.solicitarEntrada("Digite seu Nome");
					CPF = mensagem.solicitarEntrada("Digite seu CPF");
					Celular= mensagem.solicitarEntrada("Digite seu Celular");
					Email = mensagem.solicitarEntrada("Digite seu Email");
					Senha = mensagem.solicitarEntrada("Digite sua Senha");
					Usuario usuario = new Usuario(Nome,CPF,Celular,Email,Senha);
					mensagem.mostrarMensagemDeSucesso(usuario.getUsuario());
					break;
					
				case 3:
					System.exit(0);
					break;
					
					}
			
		
			
		}while (OpcaoNum == 3);
	}

} 
