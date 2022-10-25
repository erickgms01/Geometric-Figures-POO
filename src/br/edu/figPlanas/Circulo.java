package br.edu.figPlanas;

import java.util.Scanner;

public class Circulo {
	private double raio, area, perimetro;

	Scanner sc = new Scanner(System.in);

	public void setRaio() {
		System.out.print("Digite o raio do circulo: ");
		raio = sc.nextDouble();
	}

	public void calcArea() {
		area = Math.PI * Math.pow(raio, 2);
	}

	public void calcPerimetro() {
		perimetro = 2 * Math.PI * raio;
	}
	
	public void getArea() {
		System.out.format("\nA area do circulo é: %.2f!\n", area);
	}
	
	public void getPerimetro() {
		System.out.format("O perimetero do circulo é: %.2f!\n\n", perimetro);
	}
	
	
}
