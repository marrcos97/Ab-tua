/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo5.exercicio2;

/**
 *
 * @author marcos.gomes
 */
public class Triangulo {
    double base;
    double altura;
    
    double getArea(){
        
       return (base*altura)/2;
        
    }
    
    public String dadosTriangulo(){
        
        return "Base: " + base + "Altura: " + altura + "Area: " +getArea();
        
    }
}
