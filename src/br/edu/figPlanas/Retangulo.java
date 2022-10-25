package br.edu.figPlanas;

import java.util.Scanner;

public class Retangulo {
	double base, h, area, perimetro;
	Scanner sc = new Scanner(System.in);

	public void setBase() {
		System.out.println("Digite a base: ");
		base = sc.nextDouble();
	}
	
	public void setAltura() {
		System.out.println("Digite a altura: ");
		h = sc.nextDouble();
	}

	public void calcArea() {
		area = base * h;
	}

	public void calcPerimetro() {
		perimetro = 2 * (base + h);
	}
	
	public void getArea() {
		System.out.format("\nA area do retangulo é: %.2f!", area);
	}

	public void getPerimetro() {
		System.out.format("\nO perimetro do retangulo é: %.2f!\n\n", perimetro);
	}
}
