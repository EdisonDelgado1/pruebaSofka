
import java.util.*;
public class valorTiquete {

	public static void main(String[] args) {
		
		int distancia;
		int diasPermanencia;
		float valorTiquete;
		int continuar = 1;
		int valorKm = 35; //valorkil�metro y descuento se asumir�n como variables
		float descuento = (float) 0.30;
		
		while (continuar == 1 ) 
		{  //ciclo para garantizar las iteraciones que desee el usuario
			distancia = 0;
			diasPermanencia = 0;
			valorTiquete = 0;
			Scanner reader = new Scanner(System.in);
	
			System.out.println("Ingese distancia en Kil�metros: ");
		    distancia = reader.nextInt();
		    
		    System.out.println("Ingese d�as de permanencia ");
		    diasPermanencia = reader.nextInt();
		    
		    //Calcular y mostrar valor del tiquete
		    
		    if(distancia > 1000 && diasPermanencia > 7) {
		    	
		    	valorTiquete = ((distancia * valorKm) - (distancia * valorKm * descuento));
		    	
		    }else {
		    	
		    	valorTiquete = (distancia * valorKm);
		    	
		    }
			
		    System.out.println("El valor a pagar es: " + valorTiquete );
		    System.out.println("Pulse 1 si desea hacer un nuevo c�lculo u otro n�mero si desea salir");
		    continuar = reader.nextInt();

		}
		

	}

}
