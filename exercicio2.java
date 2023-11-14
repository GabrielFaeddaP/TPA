package ExercicioVetor;
import java.util.Scanner;
public class exercicio2 {
	public static void main(String args[]) {
		Scanner in  = new Scanner(System.in);
		int a[], i, multi, num;
		final int  TAM=5;
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Escreva o "+(i+1)+"º valor que queira saber a tabuada");
			a[i] = in.nextInt();
			for(num=1; num<=10; num++) {
				multi = a[i]*num;
				System.out.println(a[i]+" x "+num+" = "+multi);
			}
		}
		in.close();
	}
}