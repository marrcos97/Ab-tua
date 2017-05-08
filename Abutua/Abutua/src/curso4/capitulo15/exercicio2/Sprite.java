/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo15.exercicio2;

/**
 *
 * @author Marcos.Gomes
 */
public class Sprite extends Retangulo{
    
    private int centroX;
    private int centroY;

    /**
     * @return the centrox
     */
    public int getCentroX() {
        return centroX;
    }

    /**
     * @param centrox the centrox to set
     */
    public void setCentroX(int centroX) {
        this.centroX = centroX;
    }

    /**
     * @return the centroY
     */
    public int getCentroY() {
        return centroY;
    }

    /**
     * @param centroY the centroY to set
     */
    public void setCentroY(int centroY) {
        this.centroY = centroY;
    }
    
    public int getCentroRealY() {
        return super.getAltura()/2;
    }
    public int getCentroRealX() {
        return super.getLargura()/2;
    }
}
