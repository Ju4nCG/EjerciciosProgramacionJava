package ud3Entregables;
import java.util.Scanner;
/*
 * @author Juan Casanova Gago <casanovagagojuan@gmail.com>
 * @company DAW
 * @version 1.0
 * @date 2 nov. 2021 19:36:10
 */
public class Starwars {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n" +
            "Hace mucho tiempo, en una galaxia muy, muy lejana... La Princesa\n" +
            "Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan\n" +
            "en una nave imperial robada en una misión secreta para infiltrarse\n" +
            "en otra estrella de la muerte que el imperio está construyendo\n" +
            "para destruirla.\n" +
            "(Presiona Intro para continuar)");
       
            leer.nextLine();

        int contCorrect = 1;
            switch (contCorrect) {
                case 1:
                    int s1 = (int)(Math.random() * (10)+1);
                    int s2 = (int)(Math.random() * (11)+20);
                   
                    System.out.println("Los problemas empiezan cuando deben realizar un salto\n" +
                    "hiperespacial hasta el sistema estelar " + s1 + " en el sector, " + s2 + " pero el\n" +
                    "control de navegación está estropeado y el computador tiene\n" +
                    "problemas para calcular parte de las coordenadas de salto.\n" +
                    "Chewbacca, piloto experto, se da cuenta que falta el cuarto\n" +
                    "número de la serie. Recuerda de sus tiempos en la academia de\n" +
                    "pilotos que para calcularlo hay que calcular el sumatorio entre el\n" +
                    "nº del sistema y el nº del sector (ambos inclusive).\n" +  
                    "¿Qué debe introducir?: ");
                    int respuesta1 = leer.nextInt();
                    int contador1=0;
                   
                    for(int i = s1; i <= s2; i++){
                        contador1 += i;                      
                    }
                   
                    if(contador1 == respuesta1){                      
                        contCorrect += 1;
                        System.out.println("------------------------------------------");
                    }else break;                    
                   
                case 2:  
                    int p1 = (int)(Math.random() * (7)+1);
                    int p2 = (int)(Math.random() * (5)+8);
                   
                    System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a\n" +
                    "lo lejos la estrella de la muerte. Como van en una nave imperial\n" +
                    "robada se aproximan lentamente con la intención de pasar\n" +
                    "desapercibidos. De repente suena el comunicador. “Aquí agente\n" +
                    "de espaciopuerto " + p1 + " contactando con nave imperial " + p2 + ". No están\n" +
                    "destinados en este sector. ¿Qué hacen aquí?”. Han Solo coge el\n" +
                    "comunicador e improvisa. “Eh... tenemos un fallo en el... eh...\n" +
                    "condensador de fluzo... Solicitamos permiso para atracar y\n" +
                    "reparar la nave”. El agente, que no se anda con tonterías,\n" +
                    "responde “Proporcione código de acceso o abriremos fuego”. Han\n" +
                    "Solo ojea rápidamente el manual del piloto que estaba en la\n" +
                    "guantera y da con la página correcta. El código es el productorio\n" +
                    "entre el nº del agente y el nº de la nave (ambos inclusive).\n" +
                    "¿Cuál es el código?: ");
                    int respuesta2 = leer.nextInt();
                    int contador2=1;
                   
                    for(int i = p1; i <= p2; i++){
                        contador2 *= i;                      
                    }
                   
                    if(contador2 == respuesta2){                      
                        contCorrect += 1;
                        System.out.println("------------------------------------------");
                    }else break;
                   
                case 3:
                    int n = ((int)(Math.random() * (51)+50));
                   
                    System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de\n" +
                    "la muerte, se equipan con trajes de soldados imperiales que\n" +
                    "encuentran en la nave para pasar desapercibidos y bajan. Ahora\n" +
                    "deben averiguar en qué nivel de los " + n + " existentes se encuentra el\n" +
                    "reactor principal. Se dirigen al primer panel computerizado que\n" +
                    "encuentran y la Princesa Leia intenta acceder a los planos de la\n" +
                    "nave pero necesita introducir una clave de acceso. Entonces\n" +
                    "recuerda la información que le proporcionó Lando Calrissian “La\n" +
                    "clave de acceso a los planos de la nave es el factorial de " + n + "/10 \n" +
                    "(redondeando " + n + " hacia abajo), donde " + n + " es el nº de niveles”.\n" +
                    "¿Cual es el nivel correcto?: ");
                   
                    int respuesta3 = leer.nextInt();
                    n=n/10;
                    int contador3 = 1;                  
                    for (int i = 1; i <= n; i++) {
                        contador3*=i;                      
                    }
                   
                    if(contador3==respuesta3){
                        contCorrect += 1;
                        System.out.println("------------------------------------------");
                    }else break;                  
                   
                case 4:
                    int p = ((int)(Math.random() * (91)+10));
                   
                    System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y\n" +
                    "encuentran la puerta acorazada que da al reactor principal. R2D2\n" +
                    "se conecta al panel de acceso para intentar hackear el sistema y\n" +
                    "abrir la puerta. Para desencriptar la clave necesita verificar si el\n" +
                    "número " + p + " es primo o no. Si es primo introduce un 1, si no lo es\n" +
                    "introduce un 0.");                
                    int respuesta4 = leer.nextInt();                  
                    int aux4=1;
                    
                    for (int i = 2; i < p; i++) {
                        if (p % i == 0){                          
                          aux4=0;
                          break;
                        }
                    }                                    
                    
                    if(respuesta4==aux4){
                        contCorrect+=1;
                        System.out.println("------------------------------------------");
                    }else break;   

                case 5:
                    int m = (int)(Math.random() * (6)+5);
                    int s = (int)(Math.random() * (6)+5);
                    System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker\n" +
                    "coloque la bomba, programe el temporizador y salir de allí\n" +
                    "corriendo. Necesita programarlo para que explote en exactamente\n" +
                    "M minutos y " + s + " segundos, el tiempo suficiente para escapar antes\n" +
                    "de que explote pero sin que el sistema de seguridad anti-\n" +
                    "explosivos detecte y desactive la bomba. Pero el temporizador\n" +
                    "utiliza un reloj Zordgiano un tanto peculiar. Para convertir los\n" +
                    "minutos y segundos al sistema Zordgiano hay que sumar el\n" +
                    "factorial de " + m + " y el factorial de " + s + ".\n" +
                    "¿Qué valor debe introducir?: ");
                    int respuesta5 = leer.nextInt();
                   
                    int contador5_1 = 1;                  
                    for (int i = 1; i <= m; i++) {
                        contador5_1*=i;                      
                    }
                   
                    int contador5_2 = 1;                  
                    for (int i = 1; i <= s; i++) {
                        contador5_2*=i;                      
                    }
                   
                    int suma5 = contador5_1 + contador5_2;
                   
                    if(respuesta5==suma5){
                        contCorrect += 1;                      
                        System.out.println("------------------------------------------");
                    }else break;                  
               
                case 6:
                    System.out.println("Luke Skywalker introduce el tiempo correcto, activa el\n" +
                    "temporizador y empiezan a sonar las alarmas. Salen de allí\n" +
                    "corriendo, no hay tiempo que perder. La nave se convierte en un\n" +
                    "hervidero de soldados de arriba a abajo y entre el caos que les\n" +
                    "rodea consiguen llegar a la nave y salir de allí a toda prisa. A\n" +
                    "medida que se alejan observan por la ventana la imagen de la\n" +
                    "colosal estrella de la muerte explotando en el silencio del espacio,\n" +
                    "desapareciendo para siempre junto a los restos del malvado\n" +
                    "imperio.\n" +
                    "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas!\n" +
                    "Enhorabuena ;D");  
                    break;
            }        
           
        if(contCorrect<6){
            System.out.println("------------------------------------------");
            System.out.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n" +
                    "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a\n" +
                    "intentarlo!");
        }
        
        System.out.println("------------------------------------------");
        System.out.println("Gracias por jugar :D");
       
    }
}
