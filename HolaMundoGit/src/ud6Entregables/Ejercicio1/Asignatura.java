package ud6Entregables.Ejercicio1;
public class Asignatura {
    
    private String nombre;
    private int codigo;
    private int curso;
    
    public Asignatura(String nombre, int codigo, int curso){
        this.setNombre(nombre);
        this.setCodigo(codigo);
        this.setCurso(curso);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public int getCurso(){
        return this.curso;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public void setCurso(int curso){
        this.curso=curso;
    }
    
    
    /*Metodo*/
    public String datos(){
        String datos=   "Alumno: " + this.nombre +"\n"+
                        "Codigo: " + this.codigo +"\n"+
                        "Curso: " + this.curso;
        return datos;      
    }
}
