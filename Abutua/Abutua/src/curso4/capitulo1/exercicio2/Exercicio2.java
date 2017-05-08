/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo1.exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class Exercicio2 {
    public static void main(String[] args){
        
      int n1 = -1;
      int cont = 0;
      
      
      while(n1 != 0){
          
            n1 = 0;
            n1 = Integer.parseInt(JOptionPane.showInputDialog(""));
            cont = cont + n1;
      }
      System.out.println(cont);
    }
}
