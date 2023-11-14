package ExercicioVetor;
import java.util.Scanner;
public class exercicio5 {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int a[], i, div;
		final int  TAM=10;
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Coloque o "+(i+1)+"º valor");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("\nOs divisores de "+a[i]+" são:");
		for(div=1;div<=a[i]; div++) {	
			if(a[i]%div==0) {
				System.out.print(div+" ");
			}else {}
		}
}
}
}