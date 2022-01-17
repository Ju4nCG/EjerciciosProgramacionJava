package ud6Entregables.Ejercicio2;
/*Enums*/
enum tipoCoche{
    MINI, UTILITARIO, FAMILIAR, DEPORTIVO
}

enum seguroCoche{
    TERCEROS, TODO_RIESGO
}

public class Coche {
    //Atributos
    private String modelo;
    private String color;
    private boolean metalizada;
    private String matricula;
    private tipoCoche tipo;
    private int año;
    private seguroCoche seguro;
    private String prueba;
    
    //Constructor
    public Coche(String modelo, String color, boolean metalizada, String matricula, tipoCoche tipo, int año, seguroCoche seguro){
        this.setModelo(modelo);
        this.setColor(color);
        this.setMetalizada(metalizada);
        this.setMatricula(matricula);
        this.setTipo(tipo);
        this.setAño(año);
        this.setSeguro(seguro);
    }
    
    /*Setters*/
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public void setMetalizada(boolean metalizada){
        this.metalizada=metalizada;
    }
    
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    
    public void setTipo(tipoCoche tipo){
        this.tipo=tipo;
    }
    
    public void setAño(int año){
        this.año=año;
    }
    
    public void setSeguro(seguroCoche seguro){
        this.seguro=seguro;
    }
    
    public seguroCoche setSeguro(){
        return this.seguro;
    }
    
    /*Getters*/
    public String getModelo(){
        return this.modelo;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public boolean getMetalizada(){
        return this.metalizada;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public tipoCoche getTipo(){
        return this.tipo;
    }
    
    public int getAño(){
        return this.año;
    }
    
    public seguroCoche getSeguro(){
        return this.seguro;
    }
    
    /*Metodo*/
    public String datos(){
        String datos=   "Modelo: " + this.modelo +"\n"+
                        "Color: " + this.color +"\n"+
                        "Metalizada: " + this.metalizada +"\n"+
                        "Matricula: " + this.matricula +"\n"+
                        "Tipo: " + this.tipo +"\n"+
                        "Año: " + this.año +"\n"+
                        "Seguro: " + this.seguro +"\n";
        return datos;      
    }
}
