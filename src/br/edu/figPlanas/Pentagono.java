package br.edu.figPlanas;

import java.util.Scanner;

public class Pentagono {
	double lado, area, perimetro;
	Scanner sc = new Scanner(System.in);

	public void setLado() {
		System.out.println("Digite o tamanho de um dos lado: ");// Caso regular
		lado = sc.nextDouble();
	}

	public void calcArea() {
		area = 1.72 * Math.pow(lado, 2);
	}

	public void calcPerimetro() {
		perimetro = lado * 5;
	}
	
	public void getArea() {
		System.out.format("\nA area do pentagono é: %.2f!", area);
	}

	public void getPerimetro() {
		System.out.format("\nO perimetro do pentagono é: %.2f!\n\n", perimetro);
	}
}
