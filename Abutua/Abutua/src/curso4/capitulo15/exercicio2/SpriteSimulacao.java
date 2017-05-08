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
public class SpriteSimulacao extends Sprite{
    private int angulo;
    private int velocidade;

    /**
     * @return the angulo
     */
    public int getAngulo() {
        while(angulo < 0)
            angulo = angulo + 360;
        while(angulo > 360)
            angulo = angulo - 360;

        return angulo;
    }

    /**
     * @param angulo the angulo to set
     */
    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    
}
