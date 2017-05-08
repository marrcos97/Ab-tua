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
public class Motor {
    
    private double potencia;
    private String numeroSerie;

    /**
     * @return the potencia
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the numeroSerie
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * @param numeroSerie the numeroSerie to set
     */
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    public String toString(){
      
        return "Numero Serie: " + getNumeroSerie()+ " Potencia: " + getPotencia();
    }
    
}
