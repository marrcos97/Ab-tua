/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo13.exercicio1;

import curso4.capitulo8.exercicio2.Data;

/**
 *
 * @author Marcos.Gomes
 */
public class Pedido {
    
    private int numeroPedido;
    private String descricao;
    private double totalPedido;
    private Data dataEntrada = new Data();
    private Cliente cliente;
    
    public Pedido(int numeroPedido){
        this.numeroPedido = numeroPedido;
    }

    /**
     * @return the numeroPedido
     */
    public int getNumeroPedido() {
        return numeroPedido;
    }

    /**
     * @param numeroPedido the numeroPedido to set
     */
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the totalPedido
     */
    public double getTotalPedido() {
        return totalPedido;
    }

    /**
     * @param totalPedido the totalPedido to set
     */
    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada.setData(dataEntrada.getDia(),dataEntrada.getMes(), dataEntrada.getAno()); 
        
    }
    public Data getDataEntrada(){
    
        return dataEntrada;
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
    
    
            
    
}
