/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo15.exercicio1;

/**
 *
 * @author Marcos.Gomes
 */
public class Cliente extends Pessoa{
    private double saldo;

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String toString(){
    
        return "" + getSaldo() + "" + super.toString();
    }
}
