package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Instanciando uma matriz e definindo seu tamanho
		System.out.print("Informe um número inteiro para representar as colunas e linhas da matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		// Adicionando elementos na matriz
		System.out.println("\nInforme valores para matriz " + n + " x " + n);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		// Listando a diagonal da matriz
		System.out.println("\nMain diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		// Coletando a quantidade de números negativos
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println("\n\nNegative numbers: " + count);

		sc.close();

	}

}
