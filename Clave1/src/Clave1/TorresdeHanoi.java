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
public class TorresdeHanoi {
        public static void Hanoi(int n, int origen,  int auxiliar, int destino){
  if(n==1)
  System.out.println("mover disco "+ n +" de Torre " + origen + " a Torre " + destino);
  else{
     Hanoi(n-1, origen, destino, auxiliar);
     System.out.println("mover disco "+ n +" de Torre "+ origen + " a Torre " + destino);
     Hanoi(n-1, auxiliar, origen, destino);
   }
 }
}
