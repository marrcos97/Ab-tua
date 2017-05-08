/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo6.exercicio2;

/**
 *
 * @author marcos.gomes
 */
public class Circulo {
    private double raio;
    
    public double getRaio(){
        return raio;
    }
    
    public void setRaio(double raio){
         this.raio = raio;
    }
     
    public double getArea(){
        
        
        double area = raio * raio * Math.PI;
        return area; 
    }
    
    public String toString(){
        
        return raio + " " + getArea() + " ";
        
    }
}
