package ExercicioVetor;
import java.util.Scanner;
public class exercicio8 {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int a[],b[], i, soma;
		final int  TAM=10;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Coloque o "+(i+1)+"º valor");
			a[i] = in.nextInt();
		}
		
		for (i=0;i<TAM;i++){
			soma = i;
			for (;soma<TAM;soma++){
				b[i] = b[i]+a[i];
			}
		}
		
		System.out.print("Vetor A [");
		for(i=0;i<TAM;i++){
		System.out.print(a[i]+" ");
		}
		System.out.println("]");
		System.out.print("Vetor B (Somatoria) : [");
		for (i=0;i<TAM;i++){
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		in.close();
		
}
}