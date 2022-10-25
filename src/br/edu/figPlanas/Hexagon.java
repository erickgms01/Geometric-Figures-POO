package br.edu.figPlanas;

import java.util.Scanner;

public class Hexagon {
	private double h, base, perimetro, area ;
	Scanner sc = new Scanner(System.in);

	public void setAltura() {
		System.out.print("Digite a altura: ");
		h = sc.nextDouble();	
	}
	public void setBase() {
		System.out.print("Digite a base: ");
		base = sc.nextDouble();
	}
	
	public void calcArea() {
		area = ((base * h) / 2) * 6;
	}

	public void calcPerimetro() {
		perimetro = base * 6; //Se regular
	}
	
	public void getArea() {
		System.out.format("\nA area do hexagono é: %.2f!\n", area);
	}
	
	public void getPerimetro() {
		System.out.format("O perimetro do hexagono é: %.2f!\n\n", perimetro);
	}
}
