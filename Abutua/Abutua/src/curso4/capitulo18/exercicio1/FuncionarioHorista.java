/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo18.exercicio1;

/**
 *
 * @author Marcos.Gomes
 */
public class FuncionarioHorista extends Funcionario{
    private double valorHora;
    private double horasTrabalhadas;
    
    public FuncionarioHorista(int numeroRegistro){
        super(numeroRegistro);
    }

    /**
     * @return the valorHora
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * @return the horasTrabalhadas
     */
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    /**
     * @param horasTrabalhadas the horasTrabalhadas to set
     */
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public double obterSalarioBruto(){
    
        return getHorasTrabalhadas() * getValorHora();
    }
    
    public String toString(){
        return super.toString()+ " " + valorHora + " " + horasTrabalhadas + " " + obterSalarioBruto(); 

    }
}
