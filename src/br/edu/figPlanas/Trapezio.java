package br.edu.figPlanas;

import java.util.Scanner;

public class Trapezio {
	double B, b, h, l1, l2, perimetro, area;
	Scanner sc = new Scanner(System.in);

	public void setBaseMenor() {
		System.out.print("Digite a base maior: ");
		B = sc.nextDouble();
	}
	public void setBaseMaior() {
		System.out.print("Digite a base menor: ");
		b = sc.nextDouble();
	}
	
	public void setAltura() {
		System.out.print("Digite a altura: ");
		h = sc.nextDouble();
	}

	public void setLadoE() {
		System.out.print("Digite o tamanho do lado da esquerda: ");
		l1 = sc.nextDouble();
	}
	
	public void setLadoD() {
		System.out.print("Digite o tamnho do lado da direita: ");
		l2 = sc.nextDouble();
	}

	public void calcArea() {
		area = ((B + b) * h) / 2;
	}

	public void calcPerimetro() {
		perimetro = l1 + l2 + b + h;
	}
	
	public void getArea() {
		System.out.format("\nA area do pentagono é: %.2f!", area);
	}

	public void getPerimetro() {
		System.out.format("\nO perimetro do pentagono é: %.2f!\n\n", perimetro);
	}
}
