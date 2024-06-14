package conta;

import java.util.*;
import conta.util.Cores;
import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(3, 123, 1, "Mariana", 500000.0f);
		c1.visualize();
		c1.withdraw(12000.0f);
		c1.visualize();
		c1.deposit(5000.0f);
		c1.visualize();
		
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "Adriana", 10000.0f);
		c1.visualize();
		c1.withdraw(12000.0f);
		c1.visualize();
		c1.deposit(5000.0f);
		c1.visualize();
		
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualize();
        cp1.withdraw(1000.0f);
		cp1.visualize();
		cp1.deposit(5000.0f);
		cp1.visualize();

		Scanner sc = new Scanner(System.in);

		int option;
		
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

			option = sc.nextInt();

			if (option == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBankzi.net - O seu Futuro começa aqui!");
				about();
                 sc.close();
				System.exit(0);
			}

			switch (option) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");

					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");

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
	}