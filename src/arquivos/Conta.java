package arquivos;

import java.io.IOException;

public class Conta {

	private String cliente;
	private int conta;
	private double saldo;
	Arquivo3 arquivar = new Arquivo3();
	
	
	public Conta (String cliente, int conta) throws IOException {
		this.cliente = cliente;
		this.conta = conta;
		arquivar.registro(conta, cliente);
	}
	
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public double getConta() {
		return conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public void exibeSaldo(){
		System.out.println("O saldo do cliente: " + this.cliente + " é " + this.saldo);
	}
	
	public void saca(Conta conta, double valor){
		conta.saldo -= valor;
	}
	
	public void deposita(Conta conta, double valor){
		conta.saldo += valor;
	}
	
	public void tranferePara (Conta destino, double valor){
		saca(this, valor);
		deposita(destino, valor);
		
	}
}
