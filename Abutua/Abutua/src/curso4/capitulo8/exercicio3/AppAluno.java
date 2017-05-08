/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo8.exercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcos.Gomes
 */
public class AppAluno {

    private Aluno aluno;

    public void receberDadosAluno() {
        int matricula = 0;
        String nome;

        matricula = (Integer.parseInt(JOptionPane.showInputDialog("Digite a Matricula:")));
        nome = (JOptionPane.showInputDialog("Digite o Nome:"));

        aluno = new Aluno();
        aluno.setMatricula(matricula);
        aluno.setNome(nome);
    }

    public void receberTrabalhos() {
        if (aluno != null) {
            aluno.setNotaTrabalho1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho 1:")));
            aluno.setNotaTrabalho2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho 2:")));
        }
    }

    public void receberProvas() {
        if (aluno != null) {
            aluno.setNotaProva1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Prova 1:")));
            aluno.setNotaProva2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Prova 2:")));
        }
    }

    public void imprimirMediaFinal() {
        if (aluno != null) {
            System.out.println(aluno.getMediaFinal());
        }
    }

    public void imprimirResultadoFinal() {
        if (aluno != null) {
            System.out.println(aluno.getResultadoFinal());
        }
    }

    public void imprimirAluno() {

        System.out.println(aluno);

    }

    public AppAluno() {
    }

    public void menu() {
        int op = 0;

        do {

            op = Integer.parseInt(JOptionPane.showInputDialog("\n 0. Sair\n"
                    + "            1. Novo Aluno\n"
                    + "            2. Receber Trabalhos\n"
                    + "            3. Receber Provas\n"
                    + "            4. Imprimir Media Final\n"
                    + "            5. Imprimir Resultado Final\n"
                    + "            6. Imprimir Aluno"));
            if (op < 0 || op > 6) {
                System.out.println("Opção inválida!");
            } else {
                if (op == 1) {
                    receberDadosAluno();
                }

                if (op == 2) {
                    receberTrabalhos();
                }

                if (op == 3) {
                    receberProvas();
                }

                if (op == 4) {
                    imprimirMediaFinal();
                }

                if (op == 5) {
                    imprimirResultadoFinal();
                }

                if (op == 6) {
                    imprimirAluno();
                }
            }
        } while (op != 0);

    }

    public static void main(String[] args) {

        AppAluno appaluno = new AppAluno();
        appaluno.menu();
    }

}
