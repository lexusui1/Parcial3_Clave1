/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clave1;

import java.util.*;
import static Clave1.TorresdeHanoi.Hanoi;

/**
 *
 * @author Lex
 */
public class TareaComputo3 {

    /**
     * @param args the command line arguments
     */

     public static void main(String[] args) {
        DirectorBuilder director = new DirectorBuilder();
        ClassMonte monte = new ClassMonte();
        
        Scanner teclado=new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
       int op = 0;
       boolean salir=false;
           System.out.println("************************************");
           System.out.println("*           Bienvenido             *");
           
       do{
           System.out.println(" ");
           System.out.println("************************************");
           System.out.println("*             MENU                 *");
           System.out.println("* 1-    Torres de Hanoi            *");
           System.out.println("* 2-    Simular Montecarlo         *");
           System.out.println("* 3-      Salir                    *");
           System.out.println("************************************");
           System.out.println("      Ingrese  una opcion           ");
           op=teclado.nextInt();

           switch(op){
               case 1:  
                    int n;
                    do{
                    System.out.println("Inserte Numero de discos: ");
                    n = sc.nextInt();
                    }while(n<=0);
                    Hanoi(n,1,2,3);
                    try  {
                        System.out.println("Pulse enter para continuar");
                        System.in.read();
                    }catch (Exception e) {  }
                   break;
               case 2:
                   
                   director.setMonteBuilder(new MonteOpeBuilder());
                   director.ConstructClassMonte(monte);
                   monte = director.getClassMonte();
                   System.out.println(monte.getN0());
                   ClassMonte monte1;
                   monte1 = monte;

                    Montecarlo radia=new Montecarlo(monte1.getCte(), monte1.getN0());
                    System.out.println("Tiempo \t núcleos");
                    System.out.println(" 0 \t "+monte1.getN0());
                    for(int i=1; i<10; i++){
                        
                        System.out.println(" "+i*monte1.getDt()+" \t "+radia.evolucion(monte1.getDt()));
                    }
                    try  {
                        System.out.println("Pulse enter para continuar");
                        System.in.read();
                    }catch (Exception e) {  }
                   break;
               case 3:
                   
                   
     /**
     * System.out.println("Demostrando          ");
     * 
     */ 
                   
                   
                   
                   
                   
                 salir=true;
                    break;
                   
            }
       }while(!salir);
        
        System.exit(0);
    }
    
}
