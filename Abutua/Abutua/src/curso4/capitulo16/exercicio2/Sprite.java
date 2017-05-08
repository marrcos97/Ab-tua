/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo16.exercicio2;

/**
 *
 * @author marcos.gomes.a1
 */
public class Sprite extends Retangulo {

    private int centroX;
    private int centroY;

    public Sprite() {
    }

    public Sprite(int centroX, int centroY, int altura, int largura) {
        this.centroX = centroX;
        this.centroY = centroY;
        super.setAltura(altura);
        super.setLargura(largura);

    }

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
        return super.getAltura() / 2;
    }

    public int getCentroRealX() {
        return super.getLargura() / 2;
    }
}
