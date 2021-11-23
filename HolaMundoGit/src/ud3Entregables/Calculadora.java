package ud3Entregables;

import java.util.Scanner;
/*
 * @author Juan Casanova Gago
 */
public class Calculadora {

    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Resto");
        System.out.println("6.Exponencial");
        System.out.println("7.Seno");
        System.out.println("8.Coseno");
        System.out.println("9.Tangente");
        System.out.println("10.Salir");
        System.out.println("-------------------");

        int nume = 0;

        while (nume != 10) {
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Resto");
            System.out.println("6.Exponencial");
            System.out.println("7.Seno");
            System.out.println("8.Coseno");
            System.out.println("9.Tangente");
            System.out.println("10.Salir");
            System.out.println("-------------------");
            System.out.println("Que quieres hacer: ");
            nume = menu.nextInt();
            if (nume == 10) {
                System.exit(0);
            } else if (nume == 7 || nume == 8 || nume == 9) {
                System.out.println("Valor de X: ");
                int X = num.nextInt();
                if (nume == 7) {
                    System.out.println("Seno = " + Math.sin(X));                 
                } else if (nume == 8) {
                    System.out.println("Coseno = " + Math.cos(X));
                } else {
                    System.out.println("Tangente = " + Math.tan(X));
                }
            } else {
                System.out.println("Valor de A: ");
                int A = num.nextInt();
                System.out.println("Valor de B: ");
                int B = num.nextInt();

                if (B == 0 && nume == 4) {
                    System.out.println("No se puede dividir por cero");
                } else {
                    switch (nume) {
                        case 1:
                            System.out.println("Suma = " + (A + B));
                            break;
                        case 2:
                            System.out.println("Resta = " + (A - B));
                            break;
                        case 3:
                            System.out.println("Multiplicacion = " + (A * B));
                            break;
                        case 4:
                            System.out.println("División = " + (A / B));
                            break;
                        case 5:
                            System.out.println("Resto = " + (A % B));
                            break;
                        case 6:  
                            System.out.println("Exponente = " + Math.pow(A, B));
                            break; 
                    }
                }
            }
            System.out.println("-------------------");
        }                   
    }
}