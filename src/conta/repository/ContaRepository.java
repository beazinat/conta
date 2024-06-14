package conta.repository;

public class ContaRepository {
	
	// CRUD da Conta
	public void searchForNumber(int number);
	public void listAll();
	public void register(Conta account);
	public void update(Conta account);
	public void delete(int number);
	
	// Métodos Bancários
	public void withdraw(int number, float value);
	public void deposit(int number, float value);
	public void transfer(int numberOrigin, int numberDestin, float value);
	
}