package model;

public class ContaPoupança extends Conta{
	private double rendimento;
	ContaPoupança (String email, double rendimento) {
		super(email);
		this.rendimento = rendimento;
	
	}
	public String Saque (double valorSaque) {
		if(valorSaque <= saldo) {
			saldo =- valorSaque;
			return (
				"Valor Sacado: " + valorSaque
				+"\nValor Saldo Após o Saque: " 
			    + saldo
			    
				);
			
					
		} else {
			return "Saldo Insuficiente";
		}
	}
	
	public String Deposito(double valorDeposito) {
		saldo += (valorDeposito + (valorDeposito*rendimento));
		return ("Valor Sacado: " + valorDeposito
				+"\nValor Saldo Após o Saque: "
				+ saldo);
	}
	
	public double getSaldo() {
		
		return saldo;
	}

}
