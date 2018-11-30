/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clave1;

import java.util.Scanner;

/**
 *
 * @author Lex
 */
public class MonteOpeBuilder extends MonteBuilder{
    double N0a;
    double ctea;
    double dta;
    Scanner teclado= new Scanner(System.in);
    @Override
    public void builN0(ClassMonte ret) {
        do{
        System.out.println("Ingrese el numero de núcleos iniciales:");
        ret.setN0(teclado.nextDouble());
         }while(ret.getN0()<=0);       
        monte = ret;
    }

    @Override
    public void builcte(ClassMonte ret) {
        do{
        System.out.println("Ingrese constante de desintegración:");
        ret.setCte(teclado.nextDouble());
         }while(ret.getCte()<=0);       
        monte = ret;
    }

    @Override
    public void buildt(ClassMonte ret) {
        do{
        System.out.println("Ingrese el intervalo de tiempo:");
        ret.setDt(teclado.nextDouble());
         }while(ret.getDt()<=0);       
        monte = ret;
    }
}
