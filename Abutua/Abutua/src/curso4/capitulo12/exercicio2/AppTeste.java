/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo12.exercicio2;

import curso4.capitulo12.exercicio1.Cliente;
import curso4.capitulo12.exercicio1.Caixa;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos.Gomes
 */
public class AppTeste {

    public static void main(String[] args) {

        Caixa cx1 = new Caixa(Integer.parseInt(JOptionPane.showInputDialog("")));
        cx1.setNomeOperador(JOptionPane.showInputDialog(""));

        Cliente cli1 = new Cliente(JOptionPane.showInputDialog(""));
        cli1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("")));

        cli1.setCaixa(cx1);
        cx1.setCliente(cli1);

        System.out.println(cli1);
        System.out.println(cx1);
    }
}
