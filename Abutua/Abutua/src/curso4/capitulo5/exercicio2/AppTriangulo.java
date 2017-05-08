/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo5.exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class AppTriangulo {
    public static void main(String args[]){
        
        Triangulo tri = new Triangulo();
        
        tri.base   = Double.parseDouble(JOptionPane.showInputDialog(""));
        tri.altura = Double.parseDouble(JOptionPane.showInputDialog(""));
        
        
        System.out.println(tri);
        System.out.println(tri.dadosTriangulo());
        
    }
}
