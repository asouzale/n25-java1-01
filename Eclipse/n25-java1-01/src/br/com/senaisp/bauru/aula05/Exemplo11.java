package br.com.senaisp.bauru.aula05;
import java.util.Scanner;

public class Exemplo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Exemplo de uso do continue: ");
		for(int i = 0; i <5; i++) {
			//Não precisa por chavinha quando é um comando só
			if (i==3) continue; //Testa a condição (faz o desvio) e pula o 3
			System.out.println(i);
		}
		sc.close();

	}

}
