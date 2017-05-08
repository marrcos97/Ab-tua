/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo13.exercicio1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Marcos.Gomes
 */
public class Cliente {
    private int codigoCliente;
    private String nomeCliente;
    ArrayList <Pedido> pedidos = new ArrayList<Pedido>();
    
    public Cliente(int codigoCliente){
    
        this.codigoCliente = codigoCliente;
    }

    public void addPedido(Pedido pedido){
    
        pedidos.add(pedido);
        
    }
    
    public Iterator getPedidosIterator(){
        
        Pedido aux;
        Iterator i = pedidos.iterator();
        
        while (i.hasNext()) {            
            aux = (Pedido) i.next();
            System.out.println(aux);
        }
        return null;
    
    }
    
    /**
     * @return the codigoCliente
     */
    public int getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * @param codigoCliente the codigoCliente to set
     */
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    
}
