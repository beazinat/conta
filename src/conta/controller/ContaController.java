package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	private ArrayList<Conta> listAccounts = new ArrayList<Conta>();
	int number = 0;

	@Override
	public void searchForNumber(int number) {
		var account = searchTheCollection(number);

		if (account != null)
			account.visualize();
		else
			System.out.println("\nA conta número: " + number + " não foi encontrada!");

	}

	@Override
	public void listAll() {
		for (var account : listAccounts) {
			account.visualize();
		}

	}

	@Override
	public void register(Conta account) {
		listAccounts.add(account);
		System.out.println("\nA conta número: " + account.getNumber() + " foi criada com sucesso!");

	}

	@Override
	public void refresh(Conta account) {
		var searchAccount = searchTheCollection(account.getNumber());

		if (searchAccount != null) {
			listAccounts.set(listAccounts.indexOf(searchAccount), account);
			System.out.println("\nA conta número: " + account.getNumber() + " foi atualizada com sucesso!");
		} else
			System.out.println("\nA conta número: " + account.getNumber() + " não foi encontrada!");

	}

	@Override
	public void delete(int number) {
		var account = searchTheCollection(number);

		if (account != null) {
			if (listAccounts.remove(account) == true)
				System.out.println("\nA conta número: " + number + " foi deletada com sucesso!");
		} else
			System.out.println("\nA conta número: " + number + " não foi encontrada!");
	}

	@Override
	public void withdraw(int number, float value) {
		var account = searchTheCollection(number);

		if (account != null) {

			if (account.withdraw(value) == true)
				System.out.println("\nO saque da conta número: " + number + " foi efetuado com sucesso!");
		} else
			System.out.println("\nA conta número: " + number + " não foi encontrada!");

	}

	@Override
	public void deposit(int number, float value) {
		var account = searchTheCollection(number);

		if (account != null) {
			account.deposit(value);
			System.out.println("\nO depósito na conta número: " + number + " foi efetuado com sucesso!");
		} else
			System.out.println(
					"\nA conta número: " + number + " não foi encontrada ou a conta destino não é uma Conta Corrente.");
	}

	@Override
	public void transfer(int originNumber, int destNumber, float value) {
		var originAccount = searchTheCollection(originNumber);
		var destAccount = searchTheCollection(destNumber);

		if (originAccount != null && destAccount != null) {

			if (originAccount.withdraw(value) == true) {
				destAccount.deposit(value);
				System.out.println("\nA transferência foi efetuada com sucesso!");
			}
		} else
			System.out.println("\nA conta de origem e/ou destino não foram encontradas!");
	}

	public int generateNumber() {
		return ++number;
	}

	public Conta searchTheCollection(int number) {
		for (var account : listAccounts) {
			if (account.getNumber() == number) {
				return account;
			}
		}

		return null;
	}

}