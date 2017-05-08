/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo16.exercicio1;

/**
 *
 * @author marcos.gomes.a1
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    
    public Pessoa(int idade){
    
        this.idade = idade;
    }
    public Pessoa(String nome){
    
        this.nome = nome;
    }
    public Pessoa(int idade,String nome){
    
        this.idade = idade;
        this.nome = nome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String toString(){
    
        return " " + getNome() + " " + getIdade();
    }
    
}
