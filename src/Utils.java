package beer4all;

import java.util.ArrayList;


public class Utils {

  	// métodos GET -------------------------------------------------------------------
	public static ArrayList getRandomProductos(ArrayList listaProductos, int cantidadProductos) {
		
		int CANTIDAD_PRODUCTOS = cantidadProductos;
		int TOTAL_PRODUCTOS = listaProductos.size(); 	
		boolean indices[] = new boolean[TOTAL_PRODUCTOS];		
		ArrayList lista = new ArrayList();
		
		int i = 0;
		int numero = 0;
		for (i=0; i<TOTAL_PRODUCTOS; i++) {indices[i] = false;}
		
		for (i=0; i<CANTIDAD_PRODUCTOS; i++) {
			do {
				numero = ((int)(Math.random()*100));
				numero = (numero%TOTAL_PRODUCTOS);
				if ((!indices[numero])&&(numero!=0)) {
					lista.add(listaProductos.get(numero));
				}
			} while (indices[numero]);
			indices[numero]=true;
		}
		return(new ArrayList(lista));
	}
}