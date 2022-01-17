package ud6Entregables.Ejercicio2;
public class Main {
    public static void main(String[] args) {
        /*Creacion objetos*/
        Coche dacia = new Coche("Dacia Duster", "Blanco", true, "3452DNL", tipoCoche.FAMILIAR, 2019, seguroCoche.TODO_RIESGO);
        Coche seat = new Coche("Seat Ibiza", "Negro", true, "1902FGH", tipoCoche.MINI, 2002, seguroCoche.TERCEROS); 
        Coche ferrari = new Coche("Ferrari f15", "Rojo", false, "5474RMS", tipoCoche.DEPORTIVO, 2021, seguroCoche.TODO_RIESGO);
        /*Impresion objetos*/
            System.out.println(dacia.datos());
            System.out.println("------------------------------------");
            System.out.println(seat.datos());
            System.out.println("------------------------------------");
            System.out.println(ferrari.datos());
    }
    
}
