package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Operaciones {
    Scanner scan=new Scanner(System.in);

    public void ingresar(double arr [], int cont,int posición)
    {
        arr[posición++]=scan.nextDouble();
        cont++;
    }

    public double suma(double arr [])
    {
        double suma=0;
        for(int i=0;i<arr.length;i++)
        {
            suma+=arr[i];
        }
        return suma;
    }


    public double promedio (double arr[], int cont)
    {
        return (suma(arr)/cont);
    }

    public void elementosArreglos(double arr[]){
        System.out.println(Arrays.toString(arr));
    }

}
