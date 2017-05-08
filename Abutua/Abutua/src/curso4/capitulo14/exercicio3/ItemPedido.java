/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo14.exercicio3;

/**
 *
 * @author Marcos.Gomes
 */
public class ItemPedido {
    
    private Produto produto;
    private double quantidade;

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the quantidade
     */
    public double getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(double quantidade) {
        if(quantidade  > 0)
        this.quantidade = quantidade;
    }
    
    public double getPreco(){
    
        
        return getQuantidade()* produto.getPreco();
    
    }
    
    public String toString() {

        return " " + getPreco()+ " " + getQuantidade()+ " " + getProduto();
    }
}
