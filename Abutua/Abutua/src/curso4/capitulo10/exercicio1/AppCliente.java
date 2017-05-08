/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo10.exercicio1;

import curso4.capitulo9.exercicio1.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Marcos.Gomes
 */
public class AppCliente {
    public static void main(String args[]) {
        ArrayList <Cliente> clientes = new ArrayList<Cliente>();
        Cliente cli;
  
        for(int i = 0; i < 5; i++){
            cli = new Cliente(); 
            cli.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Código")));
            cli.setNome(JOptionPane.showInputDialog("Digite o Nome"));
            cli.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o Saldo")));
            clientes.add(cli);
            System.out.println(cli);
        }
        
    } 
    public static void imprimir(ArrayList<Cliente>clientes){
    
        for(Cliente cli : clientes){
            System.out.println(cli);
        }
    }
}
