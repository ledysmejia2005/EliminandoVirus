package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Restaurante tradición antigua");
        System.out.println("************************");

        System.out.println("Menu del dia:");
        String rojo= "\u001B[31m";
        System.out.println(rojo+" 1. Entradas:"🍟);
        System.out.println("*****Empanaditas de iglesia------> $18000");
        System.out.println("*******Picada Antioqueña(Choricitos, morcillas, patacón-----> $33000");
        System.out.println("***** Arepa de mote con quesito -----> $15000");
        System.out.println("Salchipapa PAISA (papa criolla, papa capira, chicharrón, salchicha ranchera, queso)-----> $35000");
            String purpura= "\u001B[35m";
        System.out.println(purpura+" 2. Sobremesa:"🥃);
        System.out.println("******Agua panela con limón ------> $6000");
        System.out.println("****** Chocolate migao ------> $12500");
        System.out.println("****** Shot de tapa roja ------> $8000");
        System.out.println("****** Shot de tapa azul ------> $11000");
        System.out.println("****** Shot de tapa verde ------> $12000");
        System.out.println("****** Coctel Cucaracho ------> $38500");
        System.out.println("****** Caverne savugnon -------> $850000");
        String azul= "\u001B[34m";
        System.out.println(azul+"3. Platos Fuertes:"🥘);
        System.out.println("*******Sancocho Trifasico ------> $48000");
        System.out.println("***** Bandeja paisa -----> $62000");
        System.out.println("******* Mondongo de la abue -----> $52000");
        System.out.println("****** Sopa del obispo -----> $40000");
        System.out.println("****** Sopa de la JUANFE -----> $42000");
        String negro= "\u001B[30m";
        System.out.println(negro+"4. Postres:"🥞);
        System.out.println("****** Arroz con leche -----> $19500");
        System.out.println("****** Brevas con arequipe y queso ------> $20000");
        System.out.println("***** Dulce de vitoria ------> $18000");

        Scanner leerTeclado = new Scanner(System.in);
        Integer opcionMenu = 0;
        while (opcionMenu !=5){
            System.out.println("Digita una opción: ");
            opcionMenu=leerTeclado.nextInt();
        }
    }
}