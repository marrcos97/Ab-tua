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
public class Carro {

    private int codigo;
    private String modelo;
    private Motor motor;
    private Pneu[] pneus;

    public Carro() {
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * @return the pneus
     */
    public Pneu[] getPneus() {
        
        return pneus;
    }

    /**
     * @param pneus the pneus to set
     */
    public void setPneus(Pneu[] pneus) {
        
        this.pneus = pneus;
    }

    public String toString() {

        if (getMotor() != null && getPneus() != null) {
            String aux = "";
            for (Pneu p : pneus) {
                aux += "Pneu: " + p.toString();
            }
            return "Codigo: " + getCodigo() + " Modelo: " + getModelo() + " Motor " + getMotor() + " Pneus " + aux;

        } else if (getMotor() != null) {
            return "Codigo: " + getCodigo() + " Modelo: " + getModelo() + " Motor " + getMotor();

        } else if (getPneus() != null) {
            String aux = "";
            for (Pneu p : pneus) {
                aux += "Pneu: " + p.toString();
            }
            return "Codigo: " + getCodigo() + " Modelo: " + getModelo() + " Pneus " + aux;

        } else {
            return "Codigo: " + getCodigo() + " Modelo: " + getModelo();
        }
    }
}
