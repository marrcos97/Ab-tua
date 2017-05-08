/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo3.exercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class AppTesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        
        aluno.nome   = JOptionPane.showInputDialog("");
        double n1    = Double.parseDouble(JOptionPane.showInputDialog(""));
        double n2    = Double.parseDouble(JOptionPane.showInputDialog(""));
        double n3    = Double.parseDouble(JOptionPane.showInputDialog(""));
        double media = ((n1 + n2 + n3)/3);
        
        aluno.mediaFinal = media;
        
        if(media >= 7){
            aluno.situacao = ("Aprovado");
        }
        else{
            aluno.situacao = ("Reprovado");
        }
        
        System.out.println(aluno);
        System.out.println(aluno.situacao);
    }
}
