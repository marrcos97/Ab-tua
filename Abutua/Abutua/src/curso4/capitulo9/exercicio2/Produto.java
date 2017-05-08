/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo9.exercicio2;

/**
 *
 * @author Marcos.Gomes
 */
public class Produto {
    private String nome;
	private float preco;
	private int quantidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public float getValorEstoque(){
		return this.quantidade * this.preco;
	} 
	
	public String toString() {

		return getQuantidade() + " " + getNome() + " " + getPreco() + " " + getValorEstoque();

	}

}
