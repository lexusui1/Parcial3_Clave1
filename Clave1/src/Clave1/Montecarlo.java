/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clave1;
import java.util.*;
/**
 *
 * @author Lex
 */
public class Montecarlo {
    private double l;
    private double N;
    private double t;
//números aleatorios
    private Random rnd=new Random();
    public Montecarlo(double l, double N) {
        this.l=l;
        this.N=N;
	t=0;
    }
    public double getParticulas(){return N;}
    public double evolucion(double dt){
        int N1;
        for(int k=0; k<dt; k++){
            N1=0;
            for(int i=0; i<N; i++){
                if(rnd.nextDouble()<l)  N1++;
            }
            t+=dt;
            N-=N1;
        }
        return N;
    }
}
