package ExercicioVetor;
import java.util.Scanner;
public class exercicio11 {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int a[], i, busca=1, num, analise=0,repeat=0;
		final int  TAM=10;
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Coloque o "+(i+1)+"º valor");
			a[i] = in.nextInt();
		}
		
		while(busca<2) {
		System.out.println("Qual número quer procurar?");
		num = in.nextInt();
		
		for(i=0;i<TAM;i++) {
		if(num==a[i]) {
			analise=1;
		}
		if(analise==1) {
			System.out.println("Seu número "+num+" existe no vetor e está na "+(i+1)+"º posição");
			analise=2;
		}
		}
		
		if(analise==0) {
			System.out.println("Seu número não existe no vetor");
		}
		
		System.out.println("Quer continuar a busca?\n 1=sim\n 2=nao");
		busca = in.nextInt();
		if(busca==1){
			System.out.println("Sistema reiniciado");
			repeat=1;
		}else if(busca==2) {
			System.out.println("Sistema finalizado");
			repeat=1;
		}else{
		while(repeat==0) {
			System.out.println("Número sem função. Coloque 1 ou 2\n 1=sim\n 2=nao");
			busca = in.nextInt();
			if(busca==1) {
				repeat=1;
				System.out.println("Sistema reiniciado");
			}else if(busca==2) {
				repeat=1;
				System.out.println("Sistema finalizado");
			}else{}
		}
		}
		analise=0;
		repeat=0;
		}
		in.close();
}	
}