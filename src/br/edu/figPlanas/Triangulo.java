package br.edu.figPlanas;

import java.util.Scanner;

public class Triangulo {
	private double area, perimetro, base, altura;
	
	Scanner sc = new Scanner(System.in);

	public void setBase() {
		System.out.print("Digite a base: ");
		base = sc.nextDouble();
	}

	public void setAltura() {
		System.out.print("Digite a altura: ");
		altura = sc.nextDouble();
	}
	
	public void calcArea() {
		area = (base * altura) / 2;
	}
	
	public void calcPerimetro() {
		perimetro = base * 3;
	}
	
	public void getArea() {
		System.out.format("\nA area do pentagono é: %.2f!", area);
	}

	public void getPerimetro() {
		System.out.format("\nO perimetro do pentagono é: %.2f!\n\n", perimetro);
	}
}
