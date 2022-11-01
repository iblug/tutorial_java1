import javax.swing.JOptionPane;
class Accounting3{
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public static int howmany;
	public static double[] dividendRate;

	public void getGoods() {
		valueOfSupply = Double.parseDouble(JOptionPane.showInputDialog("Enter a ValueOfSupply"));
		vatRate = Double.parseDouble(JOptionPane.showInputDialog("Enter a VatRate"));
		expenseRate = Double.parseDouble(JOptionPane.showInputDialog("Enter a ExpenseRate"));
	}
	
	public double getVAT() {
		return valueOfSupply*vatRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

	public double getExpense() {
		return valueOfSupply*expenseRate;
	}

	public double getIncome() {
		return valueOfSupply-getExpense();
	}

	public double getPersondiv(int i) {
		if(getIncome() <= 5000) {
			int j=0;
			dividendRate[j] = 1.0;
			while (j < howmany-1) {
				dividendRate[j+1] = 0.0;
				j=j+1;
			}
		}
		return getIncome()*dividendRate[i];
		
	}

	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT ("+vatRate+") : "+getVAT());
		System.out.println("Total : "+getTotal());
		System.out.println("Expense ("+expenseRate+") : "+getExpense());
		System.out.println("Income : "+getIncome());
		
		int i=0;
		while(i < howmany) {
			System.out.println("Dividend "+(i+1)+" ("+dividendRate[i]+") : "+getPersondiv(i));
			i = i+1;
		}
		System.out.println();
	}
		
}
public class AccountingInstanceApp2 {
	
	public static void main(String[] args) {
		Accounting3 p1 = new Accounting3();
		Accounting3 p2 = new Accounting3();
		
		p1.getGoods();
		p2.getGoods();
		
		getPerson();
		
		p1.print();
		p2.print();
		
//		System.out.println(p1.getPersondiv(0)+p2.getPersondiv(0));
	}

	public static void getPerson() {
		Accounting3.howmany = Integer.parseInt(JOptionPane.showInputDialog("Enter a howmany People"));
		
		Accounting3.dividendRate = new double[Accounting3.howmany];
		int i = 0;
		while(i < Accounting3.howmany) {
			Accounting3.dividendRate[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter a Person"+(i+1)+"'s dividendRate") );
			i = i+1;
		}
	}	

}
