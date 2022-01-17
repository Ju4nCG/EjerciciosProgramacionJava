package ud6Entregables.Ejercicio1;
public class Main {
    public static void main(String[] args) {
        /*Creacion Objetos*/
        Asignatura mat = new Asignatura("Mates", 4552, 1);
        Asignatura bio = new Asignatura("Biologia", 1493, 2);
        Asignatura fis = new Asignatura("Fisica", 8928, 3);
        /*Impresion objetos*/
        System.out.println(mat.datos());
        System.out.println("------------------------------------");
        System.out.println(bio.datos());
        System.out.println("------------------------------------");
        System.out.println(fis.datos());
    }
}
