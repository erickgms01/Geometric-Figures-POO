package br.edu.figPlanas;

import java.util.Scanner;

public class Paralelogramo {
	double area, perimetro, base, h, l1, l2;
	Scanner sc = new Scanner(System.in);

	public void setLados() {
		System.out.print("Digite o primeiro lado: ");
		l1 = sc.nextDouble();
		System.out.print("Digite o segundo lado: ");
		l2 = sc.nextDouble();
	}

	public void setBase() {
		System.out.print("Digite a base: ");
		base = sc.nextDouble();	
	}
	
	public void setAltura() {
		System.out.print("Digite a altura: ");
		h = sc.nextDouble();
	}

	public void calcArea() {
		area = base * h;
	}

	public void calcPerimetro() {
		perimetro = 2 * (l1 + l2);
	}
	
	public void getArea() {
		System.out.format("\nA area do paralelogramo é: %.2f!", area);
	}

	public void getPerimetro() {
		System.out.format("\nO perimetro do paralelogramo é: %.2f!\n\n", perimetro);
	}

}
