package br.edu.menu;

import java.util.Scanner;

import br.edu.figPlanas.*;

public class Menu {
	//Variaveis de controle das planas
	String optUser, optPlanas;
	int optUserReal, optPlanasReal;
	
	//Variaveis de controle de loop
	String controlVar;
	public int controlVarReal;
	
	Scanner sc = new Scanner(System.in);
	
	//Figuras Planas ou Espaciais
	public void getUser() {
		System.out.print("Escolha qual tipo de figuras geométricas deseja trabalhar:"
				+ "\n[1]Planas"
				+ "\n[2]Espaciais"
				+ "\nResposta: ");
		optUser = sc.next();
	}

	public void verificaSetInicial() {
		try {
			optUserReal = Integer.parseInt(optUser);
			switch(optUserReal) {
			case 1:
				getUserPlanas();
				break;
			case 2: 
				getUserEspaciais();
				break;
			default: 
				System.out.println("\nOpção inválida!!");
				getUser();
				break;
			}
		}catch(NumberFormatException e) {
			error();
		}
		
	}
	
	//Qual figura espacial você quer? 
	public void getUserPlanas() {
		System.out.print("\nEscolha a forma de geométrica:\n"
				+ "[1] Circulo\n" 
				+ "[2] Hexagono\n" 
				+ "[3] Losango\n"
				+ "[4] Paralelogramo\n" 
				+ "[5] Pentagono\n" 
				+ "[6] Quadrado\n" 
				+ "[7] Retângulo\n" 
				+ "[8] Trapézio\n"
				+ "[9] Triangulo\n"
				+ "Resposta: ");
		optPlanas = sc.next();
		verificaInputPlanas();
	}

	public void verificaInputPlanas() {
		try{
			optPlanasReal = Integer.parseInt(optPlanas);
			switch (optPlanasReal) {
			case 1:
				Circulo circle = new Circulo();
				System.out.println("\n=--=--=--=--=--=Circulo=--=--=--=--=--=");
				circle.setRaio();
				circle.calcArea();
				circle.calcPerimetro();
				circle.getArea();
				circle.getPerimetro();
				break;
			case 2:
				Hexagon hexa = new Hexagon();
				System.out.println("\n=--=--=--=--=--=Hexagono=--=--=--=--=--=");
				hexa.setAltura();
				hexa.setBase();
				hexa.calcArea();
				hexa.calcPerimetro();
				hexa.getArea();
				hexa.getPerimetro();
				break;
			case 3:
				Losango los = new Losango();
				System.out.println("\n=--=--=--=--=--=Losango=--=--=--=--=--=");
				los.setDiagonais();
				los.setLado();
				los.calcArea();
				los.calcPerimetro();
				los.getArea();
				los.getPerimetro();
				break;
			case 4: 
				Paralelogramo para = new Paralelogramo();
				System.out.println("\n=--=--=--=--=--=Paralelogramo=--=--=--=--=--=");
				para.setLados();
				para.setBase();
				para.setAltura();
				para.calcArea();
				para.calcPerimetro();
				para.getArea();
				para.getPerimetro();
				break;
			case 5: 
				Pentagono pent = new Pentagono();
				System.out.println("\n=--=--=--=--=--=Pentagono=--=--=--=--=--=");
				pent.setLado();
				pent.calcPerimetro();
				pent.calcArea();
				pent.getArea();
				pent.getPerimetro();
				break;
			case 6: 
				Quadrado quad = new Quadrado();
				System.out.println("\n=--=--=--=--=--=Quadrado=--=--=--=--=--=");
				quad.setLado();
				quad.calcArea();
				quad.calcPerimetro();
				quad.getArea();
				quad.getPerimetro();
				break;
			case 7: 
				Retangulo ret = new Retangulo();
				System.out.println("\n=--=--=--=--=--=Retangulo=--=--=--=--=--=");
				ret.setBase();
				ret.setAltura();
				ret.calcArea();
				ret.calcPerimetro();
				ret.getArea();
				ret.getPerimetro();
				break;
			case 8:
				Trapezio tra = new Trapezio();
				System.out.println("\n=--=--=--=--=--=Trapezio=--=--=--=--=--=");
				tra.setBaseMaior();
				tra.setBaseMenor();
				tra.setAltura();
				tra.setLadoD();
				tra.setLadoE();
				tra.calcArea();
				tra.calcPerimetro();
				tra.getArea();
				tra.getPerimetro();
				break;
			case 9:
				Triangulo tri = new Triangulo();
				System.out.println("\n=--=--=--=--=--=Triangulo=--=--=--=--=--=");
				tri.setBase();
				tri.setAltura();
				tri.calcArea();
				tri.calcPerimetro();
				tri.getArea();
				tri.getPerimetro();
				break;
			}
			
	
		}catch(NumberFormatException e) {
			error();
		}
	}
	
	public void getUserEspaciais() {

	}
	
	public void error() {
		System.out.println("\nERRROR\nIsso não é um número, ou é um numero real!!");
	}
	
	//Repitir o codigo
	public void repeat() {
		System.out.print("Você quer continuar?\n"
				+ "[1]Sim\n"
				+ "[0]Nao\n"
				+ "Resposta: ");
		controlVar = sc.next();
		System.out.println();
		try {
			controlVarReal = Integer.parseInt(controlVar);
			switch(controlVarReal) {
			case 1: 
				controlVarReal = 1;
				break;
			case 0: 
				controlVarReal = 0;
				break;
			default:
				System.out.println("Número inválido!!");
				repeat();
			}	
		}catch(NumberFormatException e) {
			error();
			repeat();
		}
	}
}
	