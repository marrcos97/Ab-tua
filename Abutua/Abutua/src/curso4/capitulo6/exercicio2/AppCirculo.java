/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo6.exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class AppCirculo {
    public static void main(String args[]){
        
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();
        Circulo c3 = new Circulo();
        
        c1.setRaio(Double.parseDouble(JOptionPane.showInputDialog("")));
        c2.setRaio(Double.parseDouble(JOptionPane.showInputDialog("")));
        c3.setRaio(Double.parseDouble(JOptionPane.showInputDialog("")));
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
