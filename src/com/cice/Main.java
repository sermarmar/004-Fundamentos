package com.cice;

public class Main {
    public static void main(String[] args){
        
        //Operadores de comparación
        boolean esMayor=2>4; //False
        boolean esMenor=4<6;  //True
        boolean esIgual=4==5; //False
        boolean esDistinto=4!=5; //True
        
                
        //Operadores de asignación
        int numero=2;
        
        //numero++;
        System.out.println(numero++);
        //++numero;
        System.out.println(++numero);
        
        
        numero *=4; //16
        System.out.println(numero);
        numero /=4; //4
        System.out.println(numero);
        
        numero %=3; //1
        System.out.println(numero);
        
        numero=3;
        numero <<=3;
        System.out.println("Desplazamiento: "+numero);
    }
}
