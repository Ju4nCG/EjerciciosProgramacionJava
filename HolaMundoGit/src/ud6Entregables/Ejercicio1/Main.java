package ud6Entregables.Ejercicio1;
public class Main {
    public static void main(String[] args) {
        String asignatura="Mates";
        int codigo=4550;
        int curso=1;
        Asignatura mates = new Asignatura(asignatura, codigo, curso);
        String a=mates.datos();
        System.out.println(a);
    }
}
