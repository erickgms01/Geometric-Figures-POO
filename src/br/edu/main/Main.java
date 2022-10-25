package br.edu.main;

import br.edu.menu.Menu;

public class Main {

	public static void main(String[] args) {
		Menu util = new Menu();
		do { 
			util.getUser();
			util.verificaSetInicial();
			util.repeat();
		}while(util.controlVarReal == 1);
	}

}
