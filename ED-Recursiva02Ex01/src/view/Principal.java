package view;

import controller.ControllerSomaMulti;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ControllerSomaMulti contSoma = new ControllerSomaMulti();
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int resultado = contSoma.multiplicaNum(n1, n2);
		System.out.println("O resultado da multiplicação de " + n1 + " com " + n2 + " é: " + resultado);
	}
}
