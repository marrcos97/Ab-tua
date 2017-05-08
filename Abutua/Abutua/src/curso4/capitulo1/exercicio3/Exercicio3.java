/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo1.exercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class Exercicio3 {
    public static void main(String[] args){
        
      int x     =-1;
      int soma1 = 0;
      int soma2 = 0;
      int soma3 = 0;
      int soma4 = 0;
      
      while(x != 0){
      
        x = 0;
        x = Integer.parseInt(JOptionPane.showInputDialog(""));
      
        if     (x>0 &&  x<=25)  {soma1++;}
        else if(x>25 && x<=50)  {soma2++;}
        else if(x>50 && x<=75)  {soma3++;}
        else if(x>75 && x<=100) {soma4++;}
      
      }
      System.out.println(soma1);
      System.out.println(soma2);
      System.out.println(soma3);
      System.out.println(soma4);
      
      
    }
}
