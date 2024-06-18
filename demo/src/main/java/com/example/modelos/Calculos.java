package com.example.modelos;
import java.lang.Math;

public class Calculos {
    public double suma(double a,double b){
        return a+b;
    }

    public double resta(double a, double b){
        return a-b;
    }
    
    public double CuadradoBinomio(double a,double b){
        //(a+b)^2 = a^2 + 2*a*b + b^2
        return suma(suma(Math.pow(a,2),(2*a*b)),Math.pow(b, 2));
    }
}
