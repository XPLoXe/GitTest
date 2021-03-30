package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cuenta cuenta1 = new Cuenta(2, "pepe", 12000);
        System.out.println(cuenta1.getCuenta());
        System.out.println("Ingrese credito: ");
        float credito = scan.nextFloat();
        cuenta1.addCredito(credito);
        System.out.println(cuenta1.getCuenta());
        System.out.println("Ingrese dedito: ");
        float debito = scan.nextFloat();
        cuenta1.addDebito(debito);
        System.out.println(cuenta1.getCuenta());

    }
}

