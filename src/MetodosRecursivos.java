
public class MetodosRecursivos {
	
	public static long factorial(long num) {
		if(num==1) {
			return 1;
		}else {
			return num * factorial(num - 1);
		}
	}
	
    public static int divisores(int num, int div) {
		if(div==1) {
			return 1;
		}else {
			if(num%div==0) {
				System.out.println(div);
			}
			return divisores(num, div-1);
		}
	}

    public static void cocientesEnteros(int menor,int mayor,int cam) {
		if(cam>=menor) {
			double cociente=mayor/cam;
			if(mayor%cam==0) {
				System.out.println("El cociente de " + mayor + "/" + cam + " es " + cociente);
			}
			cocientesEnteros(menor, mayor, cam-1);
		}
	}
    
    public static int divisoresEnteros(int menor,int mayor,int cam) {
		if(cam>=menor) {
			int mas=0;
			if(mayor%cam==0) {
				mas++;
			}
			return mas + divisoresEnteros(menor, mayor, cam-1);
		}else {
			return 0;
		}
	}
    
    public static void conversión() {
		
	}

    public static int cantidadVocales(String cadena, int longitud, int vocal) {
    	if(longitud>0) {
    		int aux = (int)cadena.charAt(longitud);
    		if(aux == 65 || aux == 69 || aux == 73 || aux == 79 || aux == 85) {
    			vocal++;
    		}
    		return vocal + cantidadVocales(cadena, longitud-1, 0);
    	}else{
    		return 0;
    	}
    }
    
    public static void cadenaInversa(String cadena, int longitud) {
		if(longitud==0) {
			System.out.print(cadena.charAt(longitud));
		}else{
			System.out.print(cadena.charAt(longitud));
			cadenaInversa(cadena, longitud-1);
		}
	}
    
}
