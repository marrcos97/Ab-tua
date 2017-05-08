/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo1.exercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class Exercicio5 {
    public static void main(String[] args){
        
        double salario     = Double.parseDouble(JOptionPane.showInputDialog(""));
        int aumento = 1;
        
        for(int i=2001;i<2009;i++){
            
            salario = (salario + ((salario * aumento)/100));
            aumento = aumento + aumento;
            
        }
        
        System.out.println(salario);
        
    }
}
