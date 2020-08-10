package BankImplementation;

public class AddAmount {
	
	public int amount = 50;
	
	public AddAmount()
	{
	
	}
	
	public AddAmount(int value)
	{
		this.amount = amount + value;
	}

	@Override
	public String toString() {
		return "AddAmount [amount=" + amount + "]";
	}
	
	

}
