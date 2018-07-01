/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vinic
 */
public abstract class EntradaDeDados {
    
    
    public static int lerInteiro()
    {
        Scanner s = new Scanner(System.in);
        int r=0;
        try{
            r=s.nextInt();

        }catch(InputMismatchException e){
            r=0;
        }
     
        return r;
    }
    public static double lerDouble(){
        double r=0;
        Scanner s = new Scanner(System.in);
        try{
            r=s.nextDouble();

        }catch(InputMismatchException e){
            System.out.println("Por favor digite um numero Double valido.");
            r=0;
        }
        return r;
        
    }
    
}
