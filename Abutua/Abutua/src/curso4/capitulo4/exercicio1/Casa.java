/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo4.exercicio1;

/**
 *
 * @author marcos.gomes
 */
public class Casa {
    String  cor;
    int     numero;
    boolean estadoPorta  = true;
    boolean estadoJanela = true;
    
    void abrirPorta(){
        
         System.out.println("Porta Aberta");
         estadoPorta  = true;
    }
    
    void fecharPorta(){
        
         System.out.println("Porta Fechada");
         estadoPorta  = false;
    }
    
    void abrirJanela(){
        
         System.out.println("Janela Aberta");
         estadoJanela  = true;
    }
    
    void fecharJanela(){
        
         System.out.println("Janela Fechada");
         estadoJanela  = false;
    }
    
    void imprimirDadosCasa(){
        
        System.out.println(numero);
        System.out.println(cor);
        System.out.println(estadoPorta);
        System.out.println(estadoJanela);
    }
}
