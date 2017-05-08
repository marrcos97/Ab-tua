/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo3.exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class AppProduto {
    public static void main(String[] args) {
        Produto c1 = new Produto();
        Produto c2 = new Produto();
        Produto c3 = new Produto();
        
        c1.descricao = (JOptionPane.showInputDialog("Descrição do produto 1"));
        c1.valor     =  Double.parseDouble(JOptionPane.showInputDialog("Valor do produto 1"));
        c2.descricao = (JOptionPane.showInputDialog("Descrição do produto 2"));
        c2.valor     =  Double.parseDouble(JOptionPane.showInputDialog("Valor do produto 2"));
        c3.descricao = (JOptionPane.showInputDialog("Descrição do produto 3"));
        c3.valor     =  Double.parseDouble(JOptionPane.showInputDialog("Valor do produto 3"));
        
        double total = (c1.valor + c2.valor + c3. valor);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(total);
        
        

    }

}
