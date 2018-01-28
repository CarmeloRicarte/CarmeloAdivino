import java.util.Scanner;
/**
 * 
 * @author carmelo
 * @version 27/01/2018
 */
public class Aciertos {

    /**
     * @param args metodo principal
     */
    public static void main(String[] args) {
        /**
         * @param n numero introducido
         * @param x numero generado
         */
    		int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        cont = introducir(cont, x, sc);
        System.out.print("Exelente!!! Has acertado , No. de intentos: "+cont );
        sc.close();
    }

	/**
	 * @param cont contador de intentos
	 * @param x numero generado
	 * @param sc lectura de datos por teclado
	 * @return Indica si el numero es generado, se queda cerca o se pasa de este
	 */
	private static int introducir(int cont, int x, Scanner sc) {
		int n;
		do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
		return cont;
	}
}
