/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo5.exercicio1;

/**
 *
 * @author marcos.gomes
 */
public class Retangulo {
    double lado1;
    double lado2; 
    
    double getArea(){
        
        return (lado1 * lado2);
    }
    
    double getPerimetro(){
    
        return (lado1 + lado1 + lado2 + lado2);
        
    }
}
