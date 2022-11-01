class Accounting{
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : "+getVat());
		System.out.println("Total : "+getTotal());
		System.out.println("Expense : "+getExpense());
		System.out.println("Income : "+getIncome());
		System.out.println("Dividend 1 : "+getDivident1());
		System.out.println("Dividend 2 : "+getDivident2());
		System.out.println("Dividend 3 : "+getDivident3());
		System.out.println();
	}

	public double getDivident3() {
		return getIncome()*0.2;
	}
	public double getDivident2() {
		return getIncome()*0.3;
	}
	public double getDivident1() {
		return getIncome()*0.5;
	}

	public double getIncome() {
		return valueOfSupply-getExpense();
	}

	public double getExpense() {
		return valueOfSupply*expenseRate;
	}

	public double getTotal() {
		return valueOfSupply + getVat();
	}

	public double getVat() {
		return valueOfSupply*vatRate;
	}
}
public class AccountingClassApp {
	
	public static void main(String[] args) {
		Accounting p1 = new Accounting();
		Accounting p2 = new Accounting();
		Accounting p3 = new Accounting();
		
		p1.valueOfSupply = 10000.0;
		p1.vatRate = 0.1;
		p1.expenseRate = 0.3;
		p1.print();	
		
		p2.valueOfSupply = 20000.0;
		p2.vatRate = 0.05;
		p2.expenseRate = 0.2;
		p2.print();	
		
		p3.valueOfSupply = 50000.0;
		p3.vatRate = 0.2;
		p3.expenseRate = 0.1;
		p3.print();	
	}

	
}
