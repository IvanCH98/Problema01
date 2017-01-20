/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.falvizo.problema01;
import java.util.Scanner;
/**
 *
 * @author falvizo
 */
public class SPP2FAlvizoProblema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.Declaración de variables y constantes
        double r, h, vol; //radio, altura y vol
        final double pi = 3.1416; //constante pi
        Scanner kb = new Scanner (System.in);
        
        //2.Implementación de la solución
        //2.1. Pedir los datos
        System.out.println("Introduce el radio del cilindro");
        r = kb.nextDouble();
        System.out.println("Introduce la altura del cilindro");
        h = kb.nextDouble();
        //2.2 Resolver con la fórmula
        vol = pi * Math.pow(r, 2) * h;
        //3.Mostramos el resultado
        System.out.println("El volumen del cilindro es " + vol);
    }
    
}
