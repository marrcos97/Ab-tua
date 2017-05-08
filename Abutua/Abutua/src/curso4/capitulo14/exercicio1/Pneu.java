/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo14.exercicio1;

/**
 *
 * @author Marcos.Gomes
 */
public class Pneu {
    
    private double tamanho;
    private String fabricante;
    
    public Pneu(double tamanho){

        this.tamanho = tamanho;
    }

    /**
     * @return the tamanho
     */
    public double getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String toString(){
      
        return "Fabricante: " + getFabricante() + " Tamanho: " + getTamanho();
    }
}
