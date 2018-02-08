import java.util.Scanner;

public class Principal extends Conta {
	
	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		
		/** Cria objeto teste GIT **/
		Conta MinhaConta;
		MinhaConta = new Conta();

		/** Entrada Nome do Usuario teste para git **/
		Scanner s = new Scanner(System.in);
		System.out.println("Digite Nome Titular: ");
		String nome = s.nextLine();
		
		/** Entrada Endereco do Usuario **/
		System.out.println("Digite Endereço Titular: ");
		String endereco = s.nextLine();
				
		/** Altera Valores **/
		MinhaConta.SetEndereco(endereco);
		MinhaConta.SetTitular(nome);
		MinhaConta.SetSaldo(1000);		
		
		/** Exibe Dados **/
		MinhaConta.MostraTitular();
		MinhaConta.MostraEndereco();
		MinhaConta.MostraCidade();
		MinhaConta.MostraSaldo();
		
		
	}
}
