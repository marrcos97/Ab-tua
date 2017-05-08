/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo9.exercicio1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos.Gomes
 */
public class AppCliente {
    public static void main(String args[]) {
        Cliente clientes[] = new Cliente[5];              
        Cliente aux;
        
        for(int i = 0; i< clientes.length; i++){
            aux = new Cliente(); 
            clientes[i] = aux;
            clientes[i].setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Código")));
            clientes[i].setNome(JOptionPane.showInputDialog("Digite o Nome"));
            clientes[i].setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o Saldo")));
        }

        AppCliente.imprimir(clientes);
        
    
    } 
    public static void imprimir(Cliente clientes[]){
    
        for(Cliente cli : clientes){
            System.out.println(cli);
        }
    }
}
