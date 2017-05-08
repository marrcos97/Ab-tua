/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo3.exercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author marcos.gomes
 */
public class AppCidade {
    public static void main(String args[]) {
        Cidade cidade1 = new Cidade();
        Cidade cidade2 = new Cidade();

        cidade1.nome = JOptionPane.showInputDialog("Nome da cidade");
        String e = JOptionPane.showInputDialog("Região (valores entre 1 e 5)");
        cidade1.regiao = Integer.parseInt(e);
        e = JOptionPane.showInputDialog("População");
        cidade1.populacao = Integer.parseInt(e);

        cidade2.nome = JOptionPane.showInputDialog("Nome da cidade");
        e = JOptionPane.showInputDialog("Região (valores entre 1 e 5)");
        cidade2.regiao = Integer.parseInt(e);
        e = JOptionPane.showInputDialog("População");
        cidade2.populacao = Integer.parseInt(e);

        String v = JOptionPane.showInputDialog("Verba a ser distribuída");
        double verba = Double.parseDouble(v);

        double umTerco = verba / 3;
        double metade = verba / 2;
        double resto1 = verba - umTerco - metade;

        double verbaRegiao1 = 0;
        switch (cidade1.regiao) {
            case 1:
                verbaRegiao1 = umTerco * 0.1;
                break;
            case 2:
                verbaRegiao1 = umTerco * 0.2;
                break;
            case 3:
                verbaRegiao1 = umTerco * 0.3;
                break;
            case 4:
                verbaRegiao1 = umTerco * 0.4;
                break;
            case 5:
                verbaRegiao1 = umTerco * 0.5;
                break;
            default:
                break;
        }
        double verbaRegiao2 = 0;
        switch (cidade2.regiao) {
            case 1:
                verbaRegiao2 = umTerco * 0.1;
                break;
            case 2:
                verbaRegiao2 = umTerco * 0.2;
                break;
            case 3:
                verbaRegiao2 = umTerco * 0.3;
                break;
            case 4:
                verbaRegiao2 = umTerco * 0.4;
                break;
            case 5:
                verbaRegiao2 = umTerco * 0.5;
                break;
            default:
                break;
        }
        double resto3 = umTerco - verbaRegiao1 - verbaRegiao2;

        double verbaPopulacao1 = 0;
        double verbaPopulacao2 = 0;
        if (cidade1.populacao < 10000) {
            verbaPopulacao1 = metade * 0.2;
        } else {
            verbaPopulacao1 = metade * 0.5;
        }
        if (cidade2.populacao < 10000) {
            verbaPopulacao2 = metade * 0.2;
        } else {
            verbaPopulacao2 = metade * 0.5;
        }
        double resto2 = metade - verbaPopulacao1 - verbaPopulacao2;

        double totalRestos = resto1 + resto2 + resto3;
        cidade1.totalVerba = (totalRestos / 2) + verbaPopulacao1 + verbaRegiao1;
        cidade2.totalVerba = (totalRestos / 2) + verbaPopulacao2 + verbaRegiao2;

        System.out.println(cidade1);
        System.out.println(cidade1.totalVerba);
        System.out.println(cidade2);
        System.out.println(cidade2.totalVerba);

    }
}
