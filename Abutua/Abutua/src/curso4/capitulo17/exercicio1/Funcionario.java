/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo17.exercicio1;

/**
 *
 * @author Marcos.Gomes
 */
public class Funcionario {
    private String nome;
    private int numeroRegistro;
    
    public Funcionario(int numeroRegistro ){
        this.numeroRegistro = numeroRegistro;
    
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
     * @return the numeroRegistro
     */
    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * @param numeroRegistro the numeroRegistro to set
     */
    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    public double obterSalarioBruto(){
        return 0;
    }
    
    public String toString(){
        return "Nome: "+ getNome() + " Número de Registro: " + getNumeroRegistro();
    }
    
    
}

