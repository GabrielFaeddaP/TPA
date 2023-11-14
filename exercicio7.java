package ExercicioVetor;
import java.util.Scanner;
public class exercicio7 {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int a[], i, fator;
		long b[];
		final int  TAM=14;
		a = new int [TAM];
		b = new long [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Coloque o "+(i+1)+"º valor");
			a[i] = in.nextInt();
		}
		
		for (i=0;i<TAM;i++){
			b[i] = a[i];
			for (fator=1;fator<a[i];fator++){
				b[i] = b[i]*fator;
			}
		}
		
		System.out.print("Vetor A [");
		for(i=0;i<TAM;i++){
		System.out.print(a[i]+" ");
		}
		System.out.println("]");
		System.out.print("Vetor B (fatorial de Vetor A) : [");
		for (i=0;i<TAM;i++){
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		in.close();
}
}