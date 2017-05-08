/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo16.exercicio1;

/**
 *
 * @author marcos.gomes.a1
 */
public class Funcionario extends Pessoa{
    
    private double salario;

    public Funcionario(int idade) {
        super(idade);
    }
    public Funcionario(int idade, double salario) {
        super(idade);
        this.salario = salario;
    }

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
