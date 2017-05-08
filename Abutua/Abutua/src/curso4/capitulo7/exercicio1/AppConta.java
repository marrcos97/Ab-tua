/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo7.exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class AppConta {

    public static void main(String args[]) {

        Conta conta = new Conta(Integer.parseInt(JOptionPane.showInputDialog("Conta:")));

        conta.setCliente(JOptionPane.showInputDialog("Cliente"));
        conta.depositar((Double.parseDouble(JOptionPane.showInputDialog("Saldo:"))));
        int opcao = 0;
        double valor = 0;

        do {

            opcao = (Integer.parseInt(JOptionPane.showInputDialog(
            "0 Sair do menu \n 1. Ver somente o saldo da conta \n2. Saque \n3. Depósito \n 4. Imprimir todos os dados da conta")));
            
            switch (opcao) {
                case (1): {
                    System.out.println(conta.getSaldo());
                    break;
                }
                case (2): {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("digite valor de saque"));
                    if (conta.sacar(valor) == false) {

                        System.out.println("Saldo Insuficiente");

                    }
                    break;

                }
                case (3): {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("digite valor de deposito"));
                    if (valor > 0) {
                        conta.depositar(valor);
                    }
                    break;

                }
                case (4): {
                    System.out.println(conta);
                    break;
                }
            }
        } while (opcao != 0);

    }
}
