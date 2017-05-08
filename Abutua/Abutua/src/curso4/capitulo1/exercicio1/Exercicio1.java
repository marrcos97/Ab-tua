/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo1.exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class Exercicio1 {
    public static void main(String[] args){
            
    /* Para o preço = 25.5 e a categoria = 1 a saída esperada para o 
    novo preço é = 28.56 e o encontrado foi = 25.5. 
    Verifique se seu cálculo está correto! expected:<25.5> but was:<28.56>*/
    double  preco      = Double.parseDouble(JOptionPane.showInputDialog(""));
    double  categoria  = Integer.parseInt(JOptionPane.showInputDialog(""));
    
    if      (preco <= 25 ){
        if      (categoria == 1){ preco = (preco + (preco *  5)/100); }
        else if (categoria == 2){ preco = (preco + (preco *  8)/100); }
        else if (categoria == 3){ preco = (preco + (preco * 10)/100); }
    }
    else{
        if      (categoria == 1){ preco = (preco + (preco * 12)/100); }
        else if (categoria == 2){ preco = (preco + (preco * 15)/100); }
        else if (categoria == 3){ preco = (preco + (preco * 18)/100); }
    }
        
    System.out.println(preco);
    
    if      (preco <= 50 ) {System.out.println("BARATO");}
    else if (preco >  50 && preco < 120 ){System.out.println("NORMAL");}
    else if (preco >= 120 ) {System.out.println("CARO");}
    }
}


