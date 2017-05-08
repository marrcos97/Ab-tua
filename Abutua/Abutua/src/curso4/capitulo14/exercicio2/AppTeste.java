/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo14.exercicio2;

import curso4.capitulo14.exercicio1.Carro;
import curso4.capitulo14.exercicio1.Motor;
import curso4.capitulo14.exercicio1.Pneu;
import javax.swing.JOptionPane;
/**
 *
 * @author Marcos.Gomes
 */
public class AppTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Motor motor = new Motor();
        Pneu pneu = new Pneu(15);
        
        
        carro.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código:")));
        carro.setModelo((JOptionPane.showInputDialog("Modelo:")));
        
        motor.setNumeroSerie(JOptionPane.showInputDialog("Num de Serie:"));
        motor.setPotencia(Double.parseDouble(JOptionPane.showInputDialog("Potencia:")));
        carro.setMotor(motor);
        
        Pneu[] pneus = new Pneu [1];
        pneus[0]= pneu;
        pneu.setFabricante("BOM PNEU");
        carro.setPneus(pneus);
        
        
        System.out.println(carro);
        
    }
}
