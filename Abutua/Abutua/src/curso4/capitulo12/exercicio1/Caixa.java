/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo12.exercicio1;

/**
 *
 * @author Marcos.Gomes
 */
public class Caixa {
    private int codigo;
    private String nomeOperador;
    private Cliente cliente;
    
    
    public Caixa(int codigo){
        this.codigo = codigo;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nomeOperador
     */
    public String getNomeOperador() {
        return nomeOperador;
    }

    /**
     * @param nomeOperador the nomeOperador to set
     */
    public void setNomeOperador(String nomeOperador) {
        this.nomeOperador = nomeOperador;
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
    
    public String toString(){
        return "Nome: " + getNomeOperador()+", Codigo: " + getCodigo();
    }

        
    
    
    
}
