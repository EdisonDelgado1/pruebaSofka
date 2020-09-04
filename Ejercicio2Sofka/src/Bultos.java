
public class Bultos {
	//Atributos
	private float peso;
	private float valorKilo;
	
	//Constructores
	public Bultos(float peso) {
		this.peso = peso;
	
	}

	public Bultos() {
	}
	
	
	
	//métodos
	
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public static float calcularPrecio(float peso, float valorKilo) {
		
		float precio;
		
		if (peso<= 25) {
			valorKilo = 0;
		}else 
			if (peso >= 26 && peso <= 300 ) {
				valorKilo = 1500;
			}else {
				valorKilo = 2500;
			}
		precio = (peso * valorKilo);
		return precio;
	}
	
	
	

}
