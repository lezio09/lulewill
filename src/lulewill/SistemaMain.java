package lulewill;

import java.util.Scanner;

public class SistemaMain {

	public static void main(String[] args) {
		
		Sacanner leitura = new Scanner (System.in);
		
		int opcaoSelecionada = 1;
		
		while(opcaoSelecionada != 0) {
		
		System.out.println("- MENU EXEMPLO -");
		System.out.println();
		System.out.println("1 CADASTRAR VEICULO");
		System.out.println("2 PROUCURAR VEICULO");
		System.out.println("3 ALTERAR PEDIDO");
		System.out.println("0 SAIR");
		System.out.println();
		
		opcaoSelecionada = leitura.nextInt();
		
		switch (opcaoSelecionada) {
		case 0: {
			
			break;
			
		}
		case 1: {
			
			
		}
		
		
		}
	}

}
