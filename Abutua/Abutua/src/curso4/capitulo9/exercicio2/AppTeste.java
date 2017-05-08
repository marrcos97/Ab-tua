/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo9.exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcos.Gomes
 */
public class AppTeste {

    public static void main(String args[]) {      

        Produto produtos[] = new Produto[5];
        Produto aux;

        for (int i = 0; i < produtos.length; i++) {
             aux = new Produto();
             produtos[i] = aux;
             produtos[i].setNome(JOptionPane.showInputDialog("Digite o Nome"));
             produtos[i].setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o Preco")));
             produtos[i].setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade")));
        }
        int psmaior = 0;
        float maiorPreco = 0;
        for(int i = 0; i < produtos.length ; i++){
            
            
            if(produtos[i].getValorEstoque() > maiorPreco ){
                maiorPreco = produtos[i].getValorEstoque();
                psmaior = i;
            }
            
        }
        System.out.println(produtos[psmaior]);
        
        for(Produto produto : produtos){
            
            System.out.println(produto);
        }

    }
}
