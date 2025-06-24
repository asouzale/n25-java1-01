package br.com.senaisp.bauru.aula06;

public class Exemplo08 {

	public static void main(String[] args) {
		//Erro sintaxe
		int x=1,y=2;
		if (x==y) {
			System.out.println("Aqui tem eror de sintaxe");
			
		}
		
		if (x>y);{
			System.out.println("X é menor que Y!");
			
		}
		for (int i=0;i<5;i++);{ //Finalizou o for antes do bloco
			System.out.println("*");
		}
		
		if (x>y) {
			System.out.println("A conta é: " + (x / (y )));
		}
	

	}

}
