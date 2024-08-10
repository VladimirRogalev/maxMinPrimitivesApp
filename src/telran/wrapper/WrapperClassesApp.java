package telran.wrapper;

public class WrapperClassesApp {

	public static void main(String[] args) {
		int a = 42;
		Integer b = 10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(a-b);
		b = b -a;
		System.out.println(b);
		System.out.println(a*b);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Boolean.TRUE);
		String strB = b.toString();
		System.out.println(strB);
		String strA = Integer.toString(a);
		System.out.println(strA);
		strA = "58";
		a = Integer.parseInt(strA);
		System.out.println(a);
		strB = "3.1415926";
		double pi = Double.parseDouble(strB);
		System.out.println(pi);
		//a = Integer.parseInt(Double.toString(pi));
		a = (int) pi;
		System.out.println(a);
		strB = "true";
		boolean check = Boolean.parseBoolean(strB);
		System.out.println(check);
		double c = -1.0/0;
		System.out.println(c);
		if (Double.isNaN(c) || Double.isInfinite(c)) {
			System.out.println("wrong result");
			
		} else  {
			System.out.println(c);
		}
		

	}

}
