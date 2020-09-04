
import java.util.Scanner;
import java.util.Stack;

public class Carga {

	public static void main(String[] args) {
		
		System.out.println("Dime el tamaño del Array");
		Scanner reader = new Scanner(System.in);
		int x= reader.nextInt();
		int I;
	
		int control2 = 1; //Controlar ciclo anidado
		float sumaPesos = 0;
		float pesoPromedio = 0;
		float menorPeso = 1000;
		float mayorPeso = 0;
		float [] pesoBultos = new float[x];
		float [] precios = new float[x];
		float sumaPrecios= 0;
		float precioTotalDolares = 0;
	    int precioDolar = 3700;
	  
	
        	I = 0;
        	control2 = 1;
        	while (control2 == 1 && sumaPesos <= 180000 && I <= x) {
      
        		System.out.println("Ingrese el peso del bulto: ");
        		pesoBultos[I] = reader.nextFloat();
        		if (pesoBultos[I] <= 500 && ((sumaPesos + pesoBultos[I]) <= 18000)){
        		   sumaPesos = +pesoBultos[I];
        		   precios[I] = Bultos.calcularPrecio(pesoBultos[I], 0);
        		   sumaPrecios = sumaPrecios + precios[I];
        		   I++;
        		}else {
        			System.out.println("Verificar, peso de bulto debe ser no mayor a 500 y total no debe ser mayor a 18000");
        		    System.out.println("El peso del bulto y el total son " +  pesoBultos[I]  + " " +sumaPesos);
        		    pesoBultos[I] = 0;
                    continue;
        		}
        		 System.out.println("Pulse 1 si desea ingresarlo de nuevo u otro número si desea finalizar");
     		    control2 = reader.nextInt();
        		
        	}
        	pesoPromedio = sumaPesos/I;
        	precioTotalDolares = (sumaPrecios * precioDolar);
        	
        	
        	I = 0;
        	//encontrar menor y mayor peso
        	
        	while  (pesoBultos[I]!=0) {
        		if (pesoBultos[I] > mayorPeso){
        			mayorPeso = pesoBultos[I];
        		}
        		if (pesoBultos[I] < menorPeso) {
        			menorPeso = pesoBultos[I];
        		}
        		
        		I++;
        	}
        	
        	System.out.println("El precio total en pesos y dólares, el peso promedio, el mayor y menor peso son respectivamente: ");
        	System.out.println( sumaPrecios + " "+ precioTotalDolares + " "+ pesoPromedio + " "+ mayorPeso + " "+ menorPeso);
        	
        }
        
	}
	
		

