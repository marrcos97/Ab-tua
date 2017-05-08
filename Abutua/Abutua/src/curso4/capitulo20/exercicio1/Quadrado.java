/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo20.exercicio1;

/**
 *
 * @author Marcos.Gomes
 */
public class Quadrado extends Figura{

    private double lado;
    
    public Quadrado(double lado){
        this.lado =lado;
    }
    
    @Override
    public double calculaArea() {
        return lado * lado;
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
