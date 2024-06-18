package com.example;
import com.example.modelos.*;

public class Main {
    public static void main(String[] args) {
        Calculos calculadora = new Calculos();

        var suma = calculadora.suma(1, 2);
        System.out.println(suma);
        var resta = calculadora.resta(1, 4);
        System.out.println(resta);
        var binomio=calculadora.CuadradoBinomio(4, 2);
        System.out.println(binomio);
    }
}