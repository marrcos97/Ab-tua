/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo17.exercicio1;



/**
 *
 * @author Marcos.Gomes
 */
public class FuncionarioMensalista extends Funcionario{

    public FuncionarioMensalista(int numeroRegistro) {
        super(numeroRegistro);
    }
    
    private double valorSalarioMinimo;
    private double quantSalarioMinimo;
    
    
    
    
    @Override
    public double obterSalarioBruto() {
        return getQuantSalarioMinimo() * getValorSalarioMinimo();
    }

    /**
     * @return the valorSalarioMinimo
     */
    public double getValorSalarioMinimo() {
        return valorSalarioMinimo;
    }

    /**
     * @param valorSalarioMinimo the valorSalarioMinimo to set
     */
    public void setValorSalarioMinimo(double valorSalarioMinimo) {
        this.valorSalarioMinimo = valorSalarioMinimo;
    }

    /**
     * @return the quantSalarioMinimo
     */
    public double getQuantSalarioMinimo() {
        return quantSalarioMinimo;
    }

    /**
     * @param quantSalarioMinimo the quantSalarioMinimo to set
     */
    public void setQuantSalarioMinimo(double quantSalarioMinimo) {
        this.quantSalarioMinimo = quantSalarioMinimo;
    }
    
    public String toString(){
        return super.toString()+ " " + valorSalarioMinimo + " " + quantSalarioMinimo + " " + obterSalarioBruto(); 

    }
}
