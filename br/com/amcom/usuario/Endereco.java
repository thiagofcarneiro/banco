/**
 * 
 */
package br.com.amcom.usuario;

/**
 * @author thiago.carneiro
 *
 */
public class Endereco extends Cidade {
	String Logradouro;
	String Bairro;
	
	public void MostraEndereco() {
		System.out.println("Endereco:"+ this.Logradouro);		
	}
	
	public void SetEndereco(String Endereco) {
		this.Logradouro = Endereco;	
	}
	
	public void GetCidade(String Endereco) {
		this.Logradouro = Endereco;	
	}
}
