/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo3.exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class AppPessoa {
    public static void main(String[] args) {
        Pessoa c1 = new Pessoa();
        Pessoa c2 = new Pessoa();
        
        c1.nome = JOptionPane.showInputDialog("");
        c1.altura = Double.parseDouble(JOptionPane.showInputDialog(""));
        
        c2.nome = JOptionPane.showInputDialog("");
        c2.altura = Double.parseDouble(JOptionPane.showInputDialog(""));
        
        if(c1.altura > c2.altura){
            System.out.println(c1);
        }
        else if(c1.altura < c2.altura){
            System.out.println(c2);
        }
        else{
            System.out.println("MESMA ALTURA");
        }

    }
}
