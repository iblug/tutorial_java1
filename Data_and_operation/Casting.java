
public class Casting {
	
	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1;
		System.out.println(e);
		
		// 1 to string
		int f = 3;
		String g = Integer.toString(f);
		System.out.println(g + g.getClass());
		
	}

}
