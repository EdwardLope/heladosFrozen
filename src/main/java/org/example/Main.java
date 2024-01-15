
package org.example;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner leerDato = new Scanner(System.in);

        System.out.println("Bienvenido a la tienda de helados FROZEN");
        System.out.println("Ingrese la cantidad de helados vendidos: ");

        System.out.println("Ingrese el preio del helado de chocolate: ");
        double precioHeladoChocolate = leerDato.nextDouble();

        System.out.println("Ingrese el preio del helado de Vainilla");
        double precioHeladoVainilla = leerDato.nextDouble();

        System.out.println("Ingrese el preio del helado de Fresa");
        double precioHeladoFresa = leerDato.nextDouble() ;


        System.out.printnl("Helados de Chocolate: ");
        int cantidadChocolate = leerDato.nextInt();

        System.out.printnl("Helados de Vainilla: ");
        int cantidadVainilla = leerDato.nextInt();

        System.out.println("Helados de Fresa: ");
        int cantidadFresa = leerDato.nextInt();


        double totalVentas = (cantidadChocolate * precioHeladoChocolate) +
                (cantidadVainilla * precioHeladoVainilla) +
                (cantidadFresa * precioHeladoFresa);


        System.out.println("Total de ventas diarias:$ " + totalVentas);


    }
}




