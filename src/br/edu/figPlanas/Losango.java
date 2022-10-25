package br.edu.figPlanas;

import java.util.Scanner;

public class Losango {
	private double d, D, tamLado, area, perimetro;
	Scanner sc = new Scanner(System.in);

	public void setDiagonais() {
		System.out.print("Digite o diagonal menor: ");
		d = sc.nextDouble();
		System.out.print("Digite o diagonal maior: ");
		D = sc.nextDouble();
	}

	public void setLado() {
		System.out.print("Digite o tamanho do lado: ");
		tamLado = sc.nextDouble();
	}

	public void calcArea() {
		area = D * d / 2;
	}

	public void calcPerimetro() {
		perimetro = tamLado * 4;
	}

	public void getArea() {
		System.out.format("\nA area do losango é: %.2f!", area);
	}

	public void getPerimetro() {
		System.out.format("\nO perimetro do losango é: %.2f!\n\n", perimetro);
	}
	
}
