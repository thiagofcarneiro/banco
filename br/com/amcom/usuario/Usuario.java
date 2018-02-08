package br.com.amcom.usuario;

public class Usuario extends Endereco {
	
    public String titular;   
    
    public void MostraTitular() {
        System.out.println("Titular Conta:"+ this.titular);
    }
    
	public void SetTitular(String Nome) {
		this.titular = Nome;	
	}

}
