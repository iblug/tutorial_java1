import javax.swing.JOptionPane;
class Accounting2{
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	
	public static int howmany;
	public static double[] divedendRate;
	public static double[] persondiv;
	
	public static void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT ("+vatRate+") : "+getVAT());
		System.out.println("Total : "+getTotal());
		System.out.println("Expense ("+expenseRate+") : "+getExpense());
		System.out.println("Income : "+getIncome());
		
		int i=0;
		while(i < howmany) {
			System.out.println("Dividend "+i+" ("+divedendRate[i]+") : "+persondiv[i]);
			i = i+1;
		}
	}

	public static double getVAT() {
		return valueOfSupply*vatRate;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	public static double getExpense() {
		return valueOfSupply*expenseRate;
	}

	public static double getIncome() {
		return valueOfSupply-getExpense();
	}

	public static double getPersondiv(int i) {
		return getIncome()*divedendRate[i];
	}

}
public class AccountingApp2 {
	
	
	
	public static void main(String[] args) {
//		public class person(){
//		
//		}		

		Accounting2.valueOfSupply = Double.parseDouble(JOptionPane.showInputDialog("Enter a ValueOfSupply"));
		Accounting2.vatRate = Double.parseDouble(JOptionPane.showInputDialog("Enter a VatRate"));
		Accounting2.expenseRate = Double.parseDouble(JOptionPane.showInputDialog("Enter a ExpenseRate"));;
		Accounting2.howmany = Integer.parseInt(JOptionPane.showInputDialog("Enter a howmany People"));

		Accounting2.divedendRate = new double[Accounting2.howmany];
		Accounting2.persondiv = new double[Accounting2.howmany];
		int i = 0;
		while(i < Accounting2.howmany) {
			Accounting2.divedendRate[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter a Person"+(i+1)+"'s divedendRate") );
			Accounting2.persondiv[i] = Accounting2.getPersondiv(i);
			i = i+1;
		}
		
		Accounting2.print();
		
	}

	

}
