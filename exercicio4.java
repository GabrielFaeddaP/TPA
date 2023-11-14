package ExercicioVetor;
import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int a[], i, par;
		final int  TAM=10;
		a = new int [TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("Coloque o "+(i+1)+"º numero");
			a[i] = in.nextInt();
		}
			for(i=0;i<TAM;i++) {
			System.out.println("\nOs números pares até "+a[i]+" :");
			for(par=0;par<=a[i];par=par+2) {
				System.out.print(par+" ");
			}
			}
			in.close();
		}
	}

