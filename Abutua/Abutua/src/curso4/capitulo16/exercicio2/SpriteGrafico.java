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
public class SpriteGrafico extends Sprite {

    private int posicaoX;
    private int posicaoY;

    public SpriteGrafico() {
    }

    public SpriteGrafico(int posicaoX, int posicaoY, int centroX, int centroY, int altura, int largura) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        super.setCentroX(centroX);
        super.setCentroY(centroY);
        super.setAltura(altura);
        super.setLargura(largura);
        
    }

    /**
     * @return the posicaoX
     */
    public int getPosicaoX() {
        return posicaoX;
    }

    /**
     * @param posicaoX the posicaoX to set
     */
    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    /**
     * @return the posicaoY
     */
    public int getPosicaoY() {
        return posicaoY;
    }

    /**
     * @param posicaoY the posicaoY to set
     */
    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }
}
