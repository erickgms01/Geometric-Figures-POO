package br.edu.figPlanas;

import java.util.Scanner;

public class Quadrado {
	Scanner sc = new Scanner(System.in);
	double area, perimetro, lado;
	public void setLado() {
		System.out.println("Digite o tamanho do lado: ");
		lado = sc.nextDouble();
	}

	public void calcArea() {
		area = lado * 2;
	}
	
	public void calcPerimetro() {
		perimetro = 2 * Math.sqrt(area);
	}
	
	public void getArea() {
		System.out.format("\nA area do quadrado é: %.2f!", area);
	}

	public void getPerimetro() {
		System.out.format("\nO perimetro do quadrado é: %.2f!\n\n", perimetro);
	}
}
