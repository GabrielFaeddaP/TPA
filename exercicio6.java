package ExercicioVetor;
import java.util.Scanner;
public class exercicio6 {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int a[], i, poten=2,TAM=11, num=1;
		a = new int [TAM];
		
		for(i=1; i<TAM; i++) {
			 num = poten*num;
			a[i] = num;
		}
		
		a[0] = 1;
		
		for(i=0;i<TAM;i++){
		System.out.print(a[i]+" ");
		}
		in.close();
}
}