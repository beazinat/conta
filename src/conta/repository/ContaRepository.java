package conta.repository;

import conta.model.Conta;

public interface ContaRepository {
	
	// CRUD da Conta
	public void searchForNumber(int number);
	public void listAll();
	public void register(Conta account);
	public void refresh(Conta account);
	public void delete(int number);
	
	// Métodos Bancários
	public void withdraw(int number, float value);
	public void deposit(int number, float value);
	public void transfer(int originNumber, int allocationNumber, float value);
	
}
