/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo9.exercicio1;

/**
 *
 * @author Marcos.Gomes
 */
public class Cliente {
    private int codigo;
	private String nome;
	private double saldo;

	public Cliente() {

	}

	public Cliente(int codigo) {
	    this.codigo = codigo;
	}

	public Cliente(double saldo, int codigo) {
	    
	    this.saldo = saldo;
	    this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String toString() {

		return getCodigo() + " " + getNome() + " " + getSaldo();

	}
}
