package palabraAleatorio;
import java.util.Arrays;
import java.util.Random;
public class ObtenerPalabrasAlAzar {

		    public static void main(String[] args) {
		    	
		    	String ahorcado[] = {"Maria","Julia","Carmen","Rosa"};
		    	
		    	int posicionAleatoria = (int) (Math.floor(Math.random() * (ahorcado.length)));
			    String palabra=ahorcado[posicionAleatoria]; // Mete la posicion en el string palabra
			    
			   System.out.println(palabra);// imprime la palabra
		    
		    } 
		    
		    
		      
		}

	
