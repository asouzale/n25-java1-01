package br.com.senaisp.bauru.aula05;
import java.util.Scanner;
public class Exemplo9 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//Utilizando a estrutura While
			String res;
			do{
				System.out.println("Digite S ou N");
				res=sc.nextLine();
		}while (!res.equals("S") && !res.equals("N"));
			System.out.println("Saiu!");
			sc.close();
	}

}