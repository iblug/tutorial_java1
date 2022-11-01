package acc;
import javax.swing.JOptionPane;

public class Accounting4{
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	public int sellGoods;
	
	public static int howmany;
	public static double[] dividendRate;

	public void getGoods() {
		valueOfSupply = Double.parseDouble(JOptionPane.showInputDialog("Enter a ValueOfSupply"));
		vatRate = Double.parseDouble(JOptionPane.showInputDialog("Enter a VatRate"));
		expenseRate = Double.parseDouble(JOptionPane.showInputDialog("Enter a ExpenseRate"));
		sellGoods = Integer.parseInt(JOptionPane.showInputDialog("Enter a sellGoods"));
	}
	public static void getPerson() {
		howmany = Integer.parseInt(JOptionPane.showInputDialog("Enter a howmany People"));
		
		dividendRate = new double[howmany];
		int i = 0;
		while(i < howmany) {
			dividendRate[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter a Person"+(i+1)+"'s dividendRate") );
			i = i+1;
		}
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
	public double getGoodsIncome() {
		return getIncome()*sellGoods;
	}
	public double getPersondiv(int i) {
		return getIncome()*dividendRate[i];
		
	}
	public double getPersonIncome(int i) {
		return getPersondiv(i)*sellGoods;
	}
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT ("+vatRate+") : "+getVAT());
		System.out.println("Total : "+getTotal());
		System.out.println("Expense ("+expenseRate+") : "+getExpense());
		System.out.println("Income : "+getIncome());
		System.out.println("Sell : "+sellGoods);
		
		int i=0;
		while(i < howmany) {
			System.out.println("Dividend "+(i+1)+" ("+dividendRate[i]+") : "+getPersondiv(i)+" => "+getPersonIncome(i));
			i = i+1;
		}
		System.out.println("=> Goods Income : "+getGoodsIncome());
		System.out.println("-----------------------------------");
		System.out.println();
	}
}