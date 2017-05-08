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
public class CambioTracaoImpl implements Cambio,CambioTracao{

     private final int [] marchas = {-1, 0, 1, 2, 3};
    private int marcha;
    private boolean tracao;
 
    public int[] getMarchas() {
        return marchas;
    }


    public int getMarcha() {
        return marcha;
    }


    public void setMarcha(int marcha) {
        if (getTracao4x4() == true) {
            marcha = marcha*10;
        }
        this.marcha = marcha;
    }


    public boolean getTracao4x4() {
        return tracao;
    }

    public void setTracao4x4(boolean tracao) {
        this.tracao = tracao;
    }
    
}
