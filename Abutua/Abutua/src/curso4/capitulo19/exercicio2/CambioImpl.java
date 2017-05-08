/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo19.exercicio2;

/**
 *
 * @author Marcos.Gomes
 */
public class CambioImpl implements Cambio{

    private final int [] marchas = {-1, 0, 1, 2, 3, 4};
    private int marcha;
    
    public int[] getMarchas() {
        return marchas;
    }


    public int getMarcha() {
        return marcha;
    }


    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    
}
