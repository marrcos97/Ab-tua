/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo3.exercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class AppCarro {
    public static void main(String[] args){
        Carro carro = new Carro();
        
        carro.velocidade = Double.parseDouble(JOptionPane.showInputDialog(""));
        double velVia   = Double.parseDouble(JOptionPane.showInputDialog(""));
        
        double tolerancia = (velVia + (velVia *0.10));
        
        if(carro.velocidade > tolerancia){
            carro.quantidadeMultas = (carro.quantidadeMultas + 1);
        }
        
        System.out.println(carro);
        System.out.println(carro.quantidadeMultas);
    }
}
