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
public abstract class MonteBuilder {
    public ClassMonte monte;
    
    public ClassMonte getClassMonte(){
        return monte;
    }
    public void CrearClassMonte(){
        monte= new ClassMonte();
    }
    
    public abstract void builN0(ClassMonte ret);
    public abstract void builcte(ClassMonte ret);
    public abstract void buildt(ClassMonte ret);
}
