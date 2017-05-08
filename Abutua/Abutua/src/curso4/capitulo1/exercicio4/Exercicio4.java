/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo1.exercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class Exercicio4 {
    public static void main(String[] args){
        
       double preco = 0;
		double imposto = 0;
		int qtConsumidor = 0;
		double salmin = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal min:"));
		double kwGasto;

		preco = (salmin / 8);

		System.out.println(preco);

		do {

			kwGasto = Double.parseDouble(JOptionPane.showInputDialog("Digite os kw gastos:"));

			if (kwGasto != 0) {
				int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo:"));

			switch(tipo){
				case (1): {
					imposto = (preco * 5) / 100;
					break;
				}
				case(2): {
					imposto = (preco * 10) / 100;
					break;
				}
				case(3): {
					imposto = (preco * 15) / 100;
					break;
				}
			}

				double valorPago = (( imposto + preco) * kwGasto );

				if (valorPago >= 500 && valorPago <= 1000) {

					qtConsumidor++;

				}

				System.out.println(valorPago);
			}

		} while (kwGasto != 0);

		System.out.println(qtConsumidor);
    }
}
