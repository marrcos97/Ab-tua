/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo3.exercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class AppFuncionario {
    public static void main(String[] args) {
        
        Funcionario fun = new Funcionario();
        
        fun.nome        = JOptionPane.showInputDialog("");
        fun.dependentes = Integer.parseInt(JOptionPane.showInputDialog(""));
        fun.salario     = Double.parseDouble(JOptionPane.showInputDialog(""));
        
        System.out.println(fun);
        System.out.println(fun.salario);
        
        if(fun.salario <= 999){
            fun.salario  = fun.salario + (fun.salario * 0.10) + fun.dependentes * 66;
            
        }
        else{
            fun.salario  = fun.salario + (fun.salario * 0.05) + fun.dependentes * 66;
            
        }
        
        System.out.println(fun);
        System.out.println(fun.salario);
        
        
    }
}
