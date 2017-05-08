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
public class Funcionario extends Pessoa{
    
    private double salario;

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String toString(){
    
        return "" + getSalario()+ "" + super.toString();
    }
}
