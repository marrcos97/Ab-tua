/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo7.exercicio1;

/**
 *
 * @author marcos.gomes
 */
public class Conta {
    private String cliente;
    private double saldo;
    private int numeroConta;
    
    public Conta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    
    public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
    public int getNumeroConta(){
        return numeroConta;
    } 

    public void depositar(double valor){
        if(valor > 0){ 
            this.saldo = this.saldo + valor;
        }
    }
    public boolean sacar(double valor){
        if (valor > 0 && getSaldo()>=valor){
            this.saldo = this.saldo - valor;
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return cliente + "" + numeroConta + "" + getSaldo();

    }
}
