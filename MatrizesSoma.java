package Aula1505;

import java.util.Scanner;

public class MatrizesSoma {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int m[][] = new int [5][5];
		int som =0;
		int valor;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				valor = (int)Math.round(Math.random()*2);
				if (valor % 2 ==0) {
					m[i][j]= valor;
					som = som+m[i][j];
				}
				}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.println("Os valores são " + m[i][j]);
			}
		}
		
		System.out.println("A soma é " + som);
		ler.close();
}
}
