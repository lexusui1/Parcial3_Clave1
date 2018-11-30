/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clave1;

/**
 *
 * @author Lex
 */
public class DirectorBuilder {
    private MonteBuilder monteBuilder;
    
    public void ConstructClassMonte(ClassMonte ret){
        monteBuilder.CrearClassMonte();
        monteBuilder.builN0(ret);
        monteBuilder.builcte(ret);
        monteBuilder.buildt(ret);
        
    }
    
    public void setMonteBuilder(MonteBuilder monteBuilder){
        this.monteBuilder=monteBuilder;
    }
    
    public ClassMonte getClassMonte(){
       return monteBuilder.getClassMonte();
    }
}
