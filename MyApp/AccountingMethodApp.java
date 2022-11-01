
public class AccountingMethodApp {
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		
		print();	
	}

	private static void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : "+getVat());
		System.out.println("Total : "+getTotal());
		System.out.println("Expense : "+getExpense());
		System.out.println("Income : "+getIncome());
		System.out.println("Dividend 1 : "+getDivident1());
		System.out.println("Dividend 2 : "+getDivident2());
		System.out.println("Dividend 3 : "+getDivident3());
	}

	private static double getDivident3() {
		return getIncome()*0.2;
	}
	private static double getDivident2() {
		return getIncome()*0.3;
	}
	private static double getDivident1() {
		return getIncome()*0.5;
	}

	private static double getIncome() {
		return valueOfSupply-getExpense();
	}

	private static double getExpense() {
		return valueOfSupply*expenseRate;
	}

	private static double getTotal() {
		return valueOfSupply + getVat();
	}

	private static double getVat() {
		return valueOfSupply*vatRate;
	}
}
