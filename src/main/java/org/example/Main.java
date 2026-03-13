package org.example;

import org.example.calculator.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {
        Calculator calculator = new Calculator();

        Scanner inputUser = new Scanner(System.in);
        try {
            System.out.println("Introduce el primer número");
            int number1 = inputUser.nextInt();

            System.out.println("Introduce el segundo número");
            int number2 = inputUser.nextInt();

            System.out.println("Introduce la operación a realizar, elige el número");
            System.out.println("1-. Sumar");
            System.out.println("2-. Restar");
            System.out.println("3-. Multiplicar");
            System.out.println("4-. Dividir");
            int operation = inputUser.nextInt();

            if(operation == 1){
                System.out.println("La suma de los dos números introducidos es: " + calculator.add(number1,number2));
            }
            if(operation == 2){
                System.out.println("La resta de los dos números introducidos es: " + calculator.substract(number1,number2));
            }
            if(operation == 3){
                System.out.println("La multiplicación de los dos números introducidos es: " + calculator.multiply(number1,number2));
            }
            if(operation == 4){
                    try {
                        System.out.println("La división de los dos números introducidos es: " + calculator.divide(number1,number2));
                    }
                    catch (ArithmeticException e){
                        System.out.println(e.getMessage());
                    }
            }
            if(operation<1 || operation>4){
                System.out.println("Operación incorrecta");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Debes escribir un número.");
            inputUser.nextLine();
        }


    }
}
