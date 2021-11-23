package ud3Entregables;
import java.util.Scanner;
/*
 * @author Juan Casanova Gago
 */
public class Riesgos {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("�Tienes alguno de los siguientes problemas?:");
        System.out.println("Contesta con una S si lo tienes y con una N si no lo tienes");
        System.out.println("------------------------------------------------------------------");
       
        int contador = 5, factores = 0;
        double porc =  0;
        System.out.println("Presion arterial alta: ");
            char respuesta = sn.next().charAt(0);
                if (respuesta == 's') {
                    contador += 15;
                    factores += 1;
                }
           
        System.out.println("Colesterol elevado: ");
            respuesta = sn.next().charAt(0);
                if (respuesta == 's') {
                    contador += 15;
                    factores += 1;
                }
               
        System.out.println("Diabetes: ");
            respuesta = sn.next().charAt(0);
                if (respuesta == 's') {
                    contador += 10;
                    factores += 1;
                }
               
        System.out.println("Obesidad: ");
            respuesta = sn.next().charAt(0);
                if (respuesta == 's') {
                    contador += 10;
                    factores += 1;
                }
               
        System.out.println("Tabaquismo: ");
            respuesta = sn.next().charAt(0);
                if (respuesta == 's') {
                    contador += 10;
                    factores += 1;
                }
               
        System.out.println("Inactividad fi�sica: ");
            respuesta = sn.next().charAt(0);
                if (respuesta == 's') {
                    contador += 10;
                    factores += 1;
                }
               
        System.out.println("Sexo masculino: ");
            respuesta = sn.next().charAt(0);
                if (respuesta == 's') {
                    contador += 5;
                    factores += 1;
                }
               
        System.out.println("Familiares con enfermedades de corazon: ");
            respuesta = sn.next().charAt(0);
                if (respuesta == 's') {
                    contador += 5;
                    factores += 1;
                }
               
        System.out.println("Edad superior a 55 anyos: ");
            respuesta = sn.next().charAt(0);
                if (respuesta == 's') {
                    contador += 5;
                    factores += 1;
                }
        System.out.println("Riesgo inicial: " + contador);
       
        switch (factores) {
            case 2:  contador *= 1.25;
                     porc += 1.25;
                     break;
            case 3: case 4:  contador *= 1.5;
                             porc += 1.5;
                     break;
            case 5: case 6:  contador *= 1.75;
                             porc += 1.75;
                     break;
            case 7: case 8:  contador *= 2;
                             porc += 2;
                     break;
            case 9:  contador *=  2.5;
                             porc += 2.5;
                     break;
        }
        System.out.println("Multiplicador: " + porc);
        System.out.println("Riesgo final: " + contador);
}

}
