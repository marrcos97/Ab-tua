/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo4.exercicio2;

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
        
        l1.codigo  = Integer.parseInt(JOptionPane.showInputDialog(""));
        l1.titulo  = JOptionPane.showInputDialog("");
        l1.autor   = JOptionPane.showInputDialog("");
        l1.editora = JOptionPane.showInputDialog("");
        l1.valor   = Double.parseDouble(JOptionPane.showInputDialog(""));
        
        l2.codigo  = Integer.parseInt(JOptionPane.showInputDialog(""));
        l2.titulo  = JOptionPane.showInputDialog("");
        l2.autor   = JOptionPane.showInputDialog("");
        l2.editora = JOptionPane.showInputDialog("");
        l2.valor   = Double.parseDouble(JOptionPane.showInputDialog(""));
        
        l3.codigo  = Integer.parseInt(JOptionPane.showInputDialog(""));
        l3.titulo  = JOptionPane.showInputDialog("");
        l3.autor   = JOptionPane.showInputDialog("");
        l3.editora = JOptionPane.showInputDialog("");
        l3.valor   = Double.parseDouble(JOptionPane.showInputDialog(""));
        
        int qtdCliente = Integer.parseInt(JOptionPane.showInputDialog(""));
        
        for(int i=1; i <= qtdCliente; i++){
            int codigoLivro  = Integer.parseInt(JOptionPane.showInputDialog(""));
            
            if(codigoLivro == l1.codigo)
            l1.novoInteressado();
            
            else if(codigoLivro == l2.codigo)
            l2.novoInteressado();
            
            else if(codigoLivro == l3.codigo)
            l3.novoInteressado();
        }
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        l1.imprimirDadosLivro();
        l2.imprimirDadosLivro();
        l3.imprimirDadosLivro();
        
        
        
    }
}
