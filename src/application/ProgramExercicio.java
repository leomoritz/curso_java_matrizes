package application;

import java.util.Scanner;

public class ProgramExercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Linhas
		System.out.println("N�mero de linhas da matriz: ");
		int linhas = sc.nextInt();

		// Colunas
		System.out.println("N�mero de colunas da matriz: ");
		int colunas = sc.nextInt();

		// Instanciando a matriz
		int[][] mat = new int[linhas][colunas];

		// Adicionando Elementos na Matriz
		System.out.println("Informe os elementos da matriz: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		// Ler um elemento que foi adicionado na matriz e verificar os valores �
		// esquerda, acima, direita e abaixo
		sc.nextLine();
		boolean achou = false;
		System.out.println("Informe um valor inteiro inserido na matriz: ");
		int x = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (x == mat[i][j]) {
					System.out.println("\nPosition: " + i + "," + j);

					if (j - 1 >= 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}

					if (j + 1 < mat[i].length) {
						System.out.println("Right: " + mat[i][j + 1]);
					}

					if (i - 1 >= 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}

					if (i + 1 < mat.length) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
					achou = true;
				}
			}
		}

		if (achou == false) {
			System.out.println("N�mero inserido n�o encontrado na matriz!");
		}

		sc.close();

	}

}
