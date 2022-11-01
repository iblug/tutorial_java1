import acc.Accounting4;

public class AccountingPersonApp2 {
	
	public static void main(String[] args) {
		Accounting4 p1 = new Accounting4();
		Accounting4 p2 = new Accounting4();
		
		p1.getGoods();
		p2.getGoods();
		
		Accounting4.getPerson();
		
		p1.print();
		p2.print();
		
		System.out.println("===================================");
		System.out.println();
		int i=0;
		while(i < Accounting4.howmany) {
			System.out.println("Person "+(i+1)+" Income : "+(p1.getPersonIncome(i)+p2.getPersonIncome(i)) );
			i=i+1;
		}
		System.out.println("=> Goods Total Income : "+(p1.getGoodsIncome()+p2.getGoodsIncome()) );
	}
}
