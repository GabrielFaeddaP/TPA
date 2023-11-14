package ExercicioVetor;
import java.util.Scanner;
public class exercicio9 {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int a[],b[],c[], i;
		final int  TAM=10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		System.out.println("Vetor A");
		for(i=0; i<TAM; i++) {
			System.out.println("Coloque o "+(i+1)+"º valor");
			a[i] = in.nextInt();
		}
		System.out.println("Vetor B");
		for(i=0; i<TAM; i++) {
			System.out.println("Coloque o "+(i+1)+"º valor");
			b[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			if(b[i]==a[i]) {
				c[i]=b[i];
			}else {}
		}
		
		System.out.print("Vetor A : [");
		for(i=0;i<TAM;i++){
		System.out.print(a[i]+" ");
		}
		System.out.println("]");
		System.out.print("Vetor B : [");
		for (i=0;i<TAM;i++){
			System.out.print(b[i]+" ");
		}
		System.out.println("]");
		System.out.print("Vetor C (interseção) : [");
		for (i=0;i<TAM;i++){
			if(c[i]==0) {}
			else {
			System.out.print(c[i]+" ");
			}
		}
		System.out.print("]");
		in.close();
		
}
}