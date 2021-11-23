package ud4Entregables;
import java.util.Scanner;

public class cuentasBancarias {
	public static void main(String[] args) {
    	Scanner index = new Scanner(System.in);
    	int menu=0;
    	double[] dinero = new double[100];
    	String[] cliente = new String[100];
    	int contador = 0;
   	 
    	System.out.println("*******************************");
    	System.out.println("* GESTOR DE CUENTAS BANCARIAS *");
    	System.out.println("*******************************");
    	do{
        	System.out.println("");
        	System.out.println("1. Ver cuentas.\n" +
                           	"2. Ingresar dinero.\n" +
                           	"3. Retirar dinero.\n" +
                           	"4. Agregar cuenta.\n" +
                           	"5. Eliminar cuenta.\n" +
                           	"6. Buscar cuenta.\n" +
                           	"7. Mostrar morosos.\n" +
                           	"8. Salir.");

        	menu = index.nextInt();              	 
       	 
        	switch(menu){
       	 
            	case 1:
	           		System.out.println("Lista de clientes:");
	           		if(cliente[0]==null) {
	           			 System.out.println("No hay cuentas todav�a");
	           		}else {
	                	for (int i = 0; i < contador; i++) {
	                    	System.out.println(i + ". " + cliente[i] + " - Saldo: " + dinero[i] + "�");
	                	}	
	                }
	                break;
                	
            	case 2:
	           		System.out.println("�A que numero de cuenta quieres a�adir dinero?");
	           		int numCuentaA = index.nextInt();
	           		if (numCuentaA < contador) {	          	
	                    System.out.print("Dime cuanto dinero quieres a�adir: ");    
	                    int añadir = index.nextInt();
	                    dinero[numCuentaA]+=añadir;
	                }else {
	                	System.out.println("Numero de cuenta invalido");
	                }
	           		break;	           			           		
           		 
            	case 3:
            		System.out.println("�A que numero de cuenta quieres retirar dinero?");
            		int numCuentaR = index.nextInt();
	           		if (numCuentaR < contador) {	          	
	                    System.out.print("Dime cuanto dinero quieres retirar: ");    
	                    int retirar = index.nextInt();
	                    dinero[numCuentaR]-=retirar;
	                }else {
	                	System.out.println("Numero de cuenta invalido");
	                }
	           		break;
           		 
            	case 4:
	           		if (contador < 100) {
	                    index.nextLine();
	                    System.out.print("Dime el nombre del propietario: ");
	                    cliente[contador] = index.nextLine();
	                    System.out.print("Dime el dinero a a�adir: ");
	                    dinero[contador] = index.nextInt();
	                    contador++;
	                }else {
	                    System.out.println("No hay capacidad para mas cuentas");
	                }
	                break;  
               	 
            	case 5:
	           		System.out.print("Dime el numero de cuenta que deseas borrar: ");
	                int borrar = index.nextInt();
	                if (borrar >= 0 && borrar < contador) {
	                    for (int i = borrar + 1; i < contador; i++) {
	                        cliente[i-1] = cliente[i];
	                        dinero[i-1] = dinero[i];
	                    }
	                    	contador--;
	                    	System.out.println("Cuenta " + borrar + " borrada");
	                	}else {
	                    	System.out.println("ERROR: No existe esa cuenta");
	                	}
	                	break;           	 
           		 
            	case 6:
            		index.nextLine();
            		System.out.print("Dime la letra que deseas buscar: ");
	                String buscar = index.nextLine();
            		for (int i = 0; i < contador; i++) {
            			cliente[i]=cliente[i].toLowerCase();
            			if(cliente[i].contains(buscar)){
            				System.out.println("El cliente: " + cliente[i] + " contiene la letra: " + buscar);
            			}            		
                	}	
           		 	break;            		 
           		 
            	case 7:
            		for (int i = 0; i < contador; i++) {
            			if(dinero[i]<0) {
            				System.out.println(cliente[i]+" es moroso y debe: " + dinero[i]);
            			}            
                	}	
           		 	break;       		 
           	 
        	}
        	System.out.println("");
        	System.out.println("*******************************");
    	}while(menu!=8);
	}

}