/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo5.exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class AppRetangulo {
    public static void main(String[] args) {
        
        Retangulo ret = new Retangulo();
        
        ret.lado1 = Double.parseDouble(JOptionPane.showInputDialog(""));
        ret.lado2 = Double.parseDouble(JOptionPane.showInputDialog(""));
        
        System.out.println(ret);
        System.out.println(ret.getPerimetro());
        System.out.println(ret.getArea());
        
    }
}
