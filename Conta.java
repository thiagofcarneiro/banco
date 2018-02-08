import br.com.amcom.usuario.*;

public class Conta extends Usuario  {
	int numero;
	double saldo;
	
    
	void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}

	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	void SetSaldo(double valor) {
		this.saldo += valor;
	}
	
	public void MostraSaldo() {
		System.out.println("Saldo atual:" + this.saldo);
	}
	
	
}
