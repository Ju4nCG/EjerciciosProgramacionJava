package ud5Entregables;
import java.util.Scanner;

public class Calculadora {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static int menu (String inicial){
        Scanner leer = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("*     Calculadora     *");
        System.out.println("-----------------------");
        
        System.out.println( "1.Suma (A+B)\n" +
                            "2.Resta (A-B)\n" +
                            "3.Multiplicar (A*B)\n" +
                            "4.Dividir (A/B)\n" +
                            "5.Area rectangulo (Base*Altura)\n" +
                            "6.Area triangulo equilatero (Base*Altura/2)\n" +
                            "7.Area circulo (Pi*(R*R))\n" +
                            "8.Seno, Coseno y Tangente (de X)\n" +
                            "9.Salir");

        int index = leer.nextInt();
        return index;
    }
    
    public static int rango (int min, int max){
        Scanner leer = new Scanner(System.in);
        int index;
        do{
            System.out.println("Numero entre " + min + "y " + max);
            index = leer.nextInt();
            if(index<min||index>max){
                System.out.println("Número fuera de rango");
            }
        }while(index<min||index>max);
        
        return index;      
    }

    public static void main(String[] args) {
        
    }
    
}


