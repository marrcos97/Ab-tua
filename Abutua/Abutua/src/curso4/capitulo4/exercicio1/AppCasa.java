/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo4.exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class AppCasa {
    public static void main(String[] args) {
        
        Casa casa = new Casa();
        
        
        casa.numero = Integer.parseInt(JOptionPane.showInputDialog(""));
        casa.cor    = JOptionPane.showInputDialog("");
        casa.estadoPorta  = false;
        casa.estadoJanela  = false;
        
        String perguntaPorta = JOptionPane.showInputDialog("");
        
        if(perguntaPorta.equals("S")){
            casa.abrirPorta();
        }
      

        String perguntaJanela = JOptionPane.showInputDialog("");
        
        if(perguntaJanela.equals("S")){
            casa.abrirJanela();
        }
       
        
        
        
        
        System.out.println(casa);
        casa.imprimirDadosCasa();

    }
}
