/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo6.exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class AppLivro {
    public static void main(String[] args) {
        
        Livro l1 = new Livro();
        Livro l2 = new Livro();
        Livro l3 = new Livro();
        
        l1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("")));
        l1.setAutor(JOptionPane.showInputDialog(""));
        l1.setTitulo(JOptionPane.showInputDialog("")); 
        l1.setValor(Double.parseDouble(JOptionPane.showInputDialog("")));
        
        l2.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("")));
        l2.setAutor(JOptionPane.showInputDialog(""));
        l2.setTitulo(JOptionPane.showInputDialog("")); 
        l2.setValor(Double.parseDouble(JOptionPane.showInputDialog("")));
        
        l3.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("")));
        l3.setAutor(JOptionPane.showInputDialog(""));
        l3.setTitulo(JOptionPane.showInputDialog("")); 
        l3.setValor(Double.parseDouble(JOptionPane.showInputDialog("")));
    
        if (l1.getValor() >= l2.getValor() && l1.getValor() >= l3.getValor() ) {
            System.out.println(l1);
      
        }
         
          if (l2.getValor() >= l1.getValor() && l2.getValor() >= l3.getValor() ) {
            System.out.println(l2);
      
        }
        
           if (l3.getValor() >= l1.getValor() && l3.getValor() >= l2.getValor() ) {
            System.out.println(l3);
      
        }
        
       
        
    }
}
