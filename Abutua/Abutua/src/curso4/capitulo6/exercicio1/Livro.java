/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo6.exercicio1;

/**
 *
 * @author marcos.gomes
 */
public class Livro {
    private int codigo;
    private String autor;
    private String titulo;
    private double valor;
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }  
    
    public String toString()
    {
         return codigo + " " + autor + " " + titulo + " " + valor;
    }
}
