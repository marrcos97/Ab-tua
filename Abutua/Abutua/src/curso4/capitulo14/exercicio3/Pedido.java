/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo14.exercicio3;

import java.util.ArrayList;

/**
 *
 * @author Marcos.Gomes
 */
public class Pedido {

    private int idPedido;
    private Cliente cliente;
    private ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();

    /**
     * @return the idPedido
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the itens
     */
    public void addItemPedido(Produto produto, int quantidade) {
        ItemPedido item;
        
        if (buscaItemPedido(produto) == null) {
            item = new ItemPedido();
            item.setProduto(produto);
            item.setQuantidade(quantidade);
            getItens().add(item);
        } else {
            
            item = buscaItemPedido(produto);
            removeItemPedido(produto);
            item.setQuantidade(quantidade + item.getQuantidade());
            itens.add(item);
        }
    }

    public void removeItemPedido(Produto produto) {

        for (int i = 0; i < getItens().size(); i++) {
            if (getItens().get(i).getProduto().getIdProduto() == produto.getIdProduto()) {
                getItens().remove(i);
            }
        }

    }

    /*No método buscaItemPedido, deve-se buscar nos 
    itens do pedido, o item do pedido que o
    id do produto seja igua ao passado.*/
    public ItemPedido buscaItemPedido(Produto produto) {

        ItemPedido procuraProd = null;

        for (int i = 0; i < getItens().size(); i++) {
            if (getItens().get(i).getProduto().getIdProduto() == produto.getIdProduto()) {
                procuraProd = getItens().get(i);
            }

        }

        return procuraProd;

    }

    /*Na classe Pedido, o método getPreco deve 
    retornar a soma de todos os preços dos itens do pedido.
    Lembre-se que os arrays deve ser instanciados.*/
    public double getPreco() {

        double preco = 0;
        for (int i = 0; i < getItens().size(); i++) {
            preco = preco + (getItens().get(i).getPreco());

        }
        return preco;
    }

    /**
     * @return the itens
     */
    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }

}
