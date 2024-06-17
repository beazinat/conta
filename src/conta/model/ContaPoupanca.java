package conta.model;

public class ContaPoupanca extends Conta{
	
	private int birthDate;
	
	public ContaPoupanca(int number, int agency, int type, String holder, float balance, int birthDate) {
		super(number, agency, type, holder, balance);
		this.birthDate = birthDate;
		
	}
	
	public int getBirthdate() {
		return birthDate;
	}
	
	public void setBirthday(int birthDate) {
		this.birthDate = birthDate;

	}
	
	@Override
		public void visualize() {
			super.visualize();
			System.out.println("Aniversário da conta: " + this.birthDate);
	}
}
