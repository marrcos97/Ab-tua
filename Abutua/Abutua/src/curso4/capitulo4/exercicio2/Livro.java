/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo4.exercicio2;

/**
 *
 * @author marcos.gomes
 */
public class Livro {
    int codigo;
    String autor;
    String titulo;
    String editora;
    double valor;
    int interessados;
    
    void novoInteressado(){
        
        System.out.println("Novo Interessado");
        interessados = (interessados + 1); 
    }
    
    void imprimirDadosLivro(){
        
        System.out.println(codigo);
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(editora);
        System.out.println(valor);
        System.out.println(interessados);
           

    }
}
