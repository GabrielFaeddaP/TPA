package ExercicioVetor;
import java.util.Scanner;
public class exercicio1 {
	public static void main(String args[]) {
		Scanner in  = new Scanner(System.in);
		int a[], b[], i, TAM=20;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Coloque o "+(i+1)+"� valor");
			a[i] = in.nextInt();
			b[i] = a[i];
		}
		
			System.out.print("Pares = [");
			for(i=0; i<TAM; i++) {
				if(a[i]%2==0) {
				System.out.print(a[i]+" ");
				}else {}
			}
			System.out.println("]");
			
			System.out.print("Impares = [");
			for(i=0; i<TAM; i++) {
				if(a[i]%2==1) {
				System.out.print(b[i]+" ");
				}else {}
		}
			System.out.println("]");
			in.close();
}
}