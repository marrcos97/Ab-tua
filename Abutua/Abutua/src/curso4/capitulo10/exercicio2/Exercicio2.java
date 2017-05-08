/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo10.exercicio2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos.Gomes
 */
public class Exercicio2 {
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<Integer>();  
        
        int i = 0;
        do{
            i= Integer.parseInt(JOptionPane.showInputDialog("Digite Numeros maiores que zero"));
            if(i>0)
            lista.add(i);
            Collections.sort(lista);
            
           
        }while(i>0);
                
        System.out.println(lista);
       
        for (int j = 1; j <= 10; j++) {
            int f = Collections.frequency(lista, j);
             System.out.println(j+":"+f); 
        }

        
    }
}
