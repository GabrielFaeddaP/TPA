package ExercicioVetor;
import java.util.Scanner;
public class exercicio3 {
	public static void main(String args[]) {
		Scanner in  = new Scanner(System.in);
		int a[], i, num, primo=0;
		final int  TAM=10;
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Coloque o "+(i+1)+"º valor");
			a[i] = in.nextInt();
		}
		
		System.out.println("Números Primos = ");
		
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+"");
		for(num=1;num<=a[i]; num++) {	
			if(a[i]%num==0) {
				primo++;
			}else {}
		}
			if(primo==2) {
				System.out.println(" e numero primo");
			}else
				{System.out.println(" nao e numero primo");
			}
			primo=0;
		}
		in.close();
	}
}