package com.cice;

import java.util.Arrays;

public class ArrayTest {
    
    //Declaración de las variables
    static int[] arrayNumeros={1,2,3};
    static int[] arrayNumeros2;
    
    public static void main(String... args){
        
        //Inicialización
        arrayNumeros2=new int[5];
        arrayNumeros2[0]=2;
        
        //Declaración
        int nombreArray[]={1,2,3}; //No se recomienda programación.
        
        int[] nuevo=Arrays.copyOf(nombreArray, 12); //Sirve para copiar
        
        for(int i:nuevo){
            System.out.println(i);
        }
        
        //Array bidimensionales;
        int[][] bidi=new int[2][4];
        
        int[] bi[]=new int[2][];
        
        bi[0]=new int[]{1,2,3};
        bi[1]=new int[]{1,2,3,4};
    }
}
