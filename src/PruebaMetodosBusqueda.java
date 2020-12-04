class BusquedaBinaria {

	public static boolean busquedaBin(int[] numeros, int valorBuscado) {

		int inicio=0;
		int fin=numeros.length-1;
		int x=0;
		while (inicio<=fin) {
			int puntero=(int)((inicio+fin)/2);
			if (valorBuscado == numeros[puntero]) {
				x=1;
				break;
			}else if(valorBuscado>numeros[puntero]) {
				inicio=puntero+1;
			}else {
				fin=puntero-1;
			}
				
		}
		return x==1;

	}

}

public class PruebaMetodosBusqueda {

	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4,5,6,7};
		if(BusquedaBinaria.busquedaBin(nums, 8)) {
			System.out.println("encontrado");
		}else {
			System.out.println("no encontrado");
		}

	}

}