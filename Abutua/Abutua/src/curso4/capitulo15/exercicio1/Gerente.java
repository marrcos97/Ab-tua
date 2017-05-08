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
public class Gerente extends Funcionario{
    
    private String area;

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }
    public String toString(){
    
        return "" + getArea()+ "" + super.toString();
    }
    
    
}
