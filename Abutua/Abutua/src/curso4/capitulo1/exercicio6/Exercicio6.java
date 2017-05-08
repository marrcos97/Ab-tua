/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo1.exercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class Exercicio6 {

    public static void main(String[] args) {

        int p = 0;
        int totalFunc = 0;
        double mediaFunc = 0;
        int maior = 0;
        int tFunc = 0;

        for (int i = 1; i <= 5; i++) {
            for (int a = 1; a <= 3; a++) {
                p = Integer.parseInt(JOptionPane.showInputDialog("Pontuação do mês:"));
                tFunc = (tFunc + p);
                totalFunc = tFunc;
                mediaFunc = (double) totalFunc / 3;
                if (p > maior) {
                    maior = p;
                }
            }
            tFunc = 0;
            System.out.println(totalFunc);
            System.out.println(mediaFunc);
        }

        System.out.println(maior);

    }
}
