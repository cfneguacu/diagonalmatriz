package diagonalmatriz;

import java.util.Scanner;

public class DiagonalMatriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o valor de N , para a matriz NxN");
		int matriz = entrada.nextInt();
		int quadrado [][] = new int[matriz][matriz];	
		boolean[] diagonal = new boolean[matriz];
		int cont=0;
		int contdiagonal = 0;
		System.out.println("A matriz será de "+matriz+"X"+matriz+" com "+(int)Math.pow(matriz, 2)+" elementos.");
		System.out.println("Digite a quantidade de elementos");
		
		for(int i = 0; i<quadrado.length;i++) {
			
			for(int j = 0; j<quadrado.length;j++) {
				
				System.out.println("elemento ("+(i+1)+","+(j+1)+")");
				
				quadrado[i][j] = entrada.nextInt();
				
			}
		}
		
		
		if(quadrado[0][0]!=0) {	
		
			for (int i = 0; i<quadrado.length;i++) {
			
				if(quadrado[i][i]!=0) {
				
					diagonal[i] = true;
					
				}
			
			}
			
		}else if(quadrado[0][quadrado.length-1]!=0) {
		
			for (int i = 0;i<quadrado.length;i++) {
			
				for(int j = 0; j<quadrado.length;j++) {
				
					if(i+j == quadrado.length-1 && quadrado[i][j]!=0) {
					
						diagonal[j] = true;
					}
				}
			}
		}

	
		for(int i =0; i<quadrado.length;i++) {
		
			for(int j = 0 ; j<quadrado.length;j++) {
			
				if(quadrado[i][j]==0) {
				
					cont++;	
			
				}
			}
		}
	
	
		for(int i =0; i<diagonal.length;i++) {
		
			if(diagonal[i]==true) {
			
				contdiagonal++;
				
			}
		
		}
	
	
		for(int i =0; i<quadrado.length;i++) {
		
			for(int j = 0 ; j<quadrado.length;j++) {
			
				System.out.print(quadrado[i][j]+" ");
			}
		
			System.out.println();
		}
	
		if(contdiagonal == matriz && cont == Math.pow(matriz, 2)-matriz) {
		
			System.out.print("Diagonal verdadeira");
		
		}else {
		
			System.out.print("Diagonal falsa");
			
		}
	}
}

	
	

