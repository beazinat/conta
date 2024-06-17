package conta;

import java.util.*;
import java.io.IOException;
import conta.util.Cores;
import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {
		
		ContaController accounts = new ContaController();
		
		Scanner sc = new Scanner(System.in);

		int option, number, agency, type, birthDate;
		String holder;
		float balance, limit;
		
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND 
					         + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                      BANKZI.NET                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				option = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				sc.nextLine();
				option = 0;
			}

			if (option == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBankzi.net - O seu Futuro começa aqui!");
				about();
                 sc.close();
				System.exit(0);
			}

			switch (option) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
					
					System.out.println("Digite o Número da Agência: ");
					agency = sc.nextInt();
					System.out.println("Digite o Nome do Titular: ");
					sc.skip("\\R?");
					holder = sc.nextLine();
					
					do {
						System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
						type = sc.nextInt();
					} while(type < 1 || type > 2);
					
					System.out.println("Digite o Saldo da Conta (R$): ");
					balance = sc.nextFloat();
					
					switch(type) {
					    case 1 -> {
					    	System.out.println("Digite o Limite de Crédito (R$): ");
					    	limit = sc.nextFloat();
					    	accounts.register(new ContaCorrente(accounts.generateNumber(), agency, type, holder, balance, limit));
					    }
					    case 2 -> {
					    	System.out.println("Digite o dia do Aniversário da Conta: ");
					    	birthDate = sc.nextInt();
					    	accounts.register(new ContaPoupanca(accounts.generateNumber(), agency, type, holder, balance, birthDate));
					    }
					}
					keyPress();
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
					accounts.listAll();
					keyPress();
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

					break;
				case 7:
					System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");

					break;
				case 8:
					System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");

					break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void about() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Beazinat Gonçalves");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
		}
	
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}