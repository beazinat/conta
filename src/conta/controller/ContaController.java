package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	private ArrayList<Conta> listAccounts = new ArrayList<Conta>();
	int number = 0;
	
	@Override
	public void searchForNumber(int number) {
		// TODO Auto-generated method stub
		
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
		System.out.println("\n Conta número: " + account.getNumber() + " foi criada com sucesso!");
		
	}

	@Override
	public void refresh(Conta account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(int number, float value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(int number, float value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(int originNumber, int allocationNumber, float value) {
		// TODO Auto-generated method stub
		
	}
	
	public int generateNumber() {
		return ++ number;
	}

}
