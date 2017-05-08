/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo11.exercicio1;

/**
 *
 * @author Marcos.Gomes
 */
public class Funcionario {
    private int codigo;
	private String funcao; 
	private String nome;
	
	public Funcionario(){}
	
	public Funcionario(int codigo){
	    this.codigo = codigo;
	}	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
