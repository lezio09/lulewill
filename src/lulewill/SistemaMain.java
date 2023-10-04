package lulewill;

import java.util.Scanner;

public class SistemaMain {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		int op = 1;
		
		while(op != 0) {
		
		System.out.println("- MENU EXEMPLO -");
		System.out.println();
		System.out.println("0 SAIR DO PROGRAMA");
		System.out.println("1 CADASTRAR VEICULO");
		System.out.println("2 PROUCURAR VEICULO");
		System.out.println("3 ALTERAR PEDIDO");
		System.out.println();
		
		op = leitura.nextInt();
		
		switch (op) {
		case 0: {
		
		System.out.println("Saindo");
		
		break;
			
		}
		case 1: {
			
		System.out.println("Cadastrar Veiculo");
		System.out.println();
		System.out.println("modelo: ");
		
		String modelo = leitura.nextLine();
		
		System.out.println("Ano: ");
		int ano = leitura.nextInt();
		
		System.out.println();
		System.out.println("Tem certeza que quer cadastrar o veiculo ?");
		System.out.println("1 - Sim");
		System.out.println("2 - Nao");
		System.out.println();
		int op2 = leitura.nextInt();
		
		
		if(op2 ==  1 ) {
			System.out.println("Veiculo Cadastrado");
		}
		if(op2 == 2) {
			System.out.println("Saindo");
			
			break;
		
		}
		break;
		}
		
		
		}
	}

}
}