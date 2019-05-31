/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package condicionaljava;

import java.util.Scanner;
/**
 *
 * @author Alriosa
 */
public class CondicionalJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int variableA;
        int variableB;
        
        System.out.println("Ingrese el valor de la Variable A");
        variableA = in.nextInt();
        System.out.println("Ingrese el valor de la Variable B");
        variableB = in.nextInt();
        
        if (variableA > variableB){
        
            System.out.println("El valor de A es mayor");
        
        } else
        {
            System.out.println("El valor de B es mayor");
        
        }
        
        
        
    }


    
}
