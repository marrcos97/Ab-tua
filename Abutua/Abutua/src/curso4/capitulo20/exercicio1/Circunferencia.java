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
public class Circunferencia extends Figura {

    private double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return raio * raio * Math.PI;
    }

    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

}
