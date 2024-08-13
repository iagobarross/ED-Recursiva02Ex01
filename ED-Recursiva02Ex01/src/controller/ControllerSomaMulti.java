//1. Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da multiplicação de A por B.
package controller;

public class ControllerSomaMulti {
	
	public ControllerSomaMulti() {
		super();
	}
	
	public int multiplicaNum(int n1, int n2) {
		int soma = 0;
		if(n1 == 0) {
			return 0;
		} else {
			soma = soma + n2;
			return soma + multiplicaNum(n1 - 1, n2);
		}
	}
}
