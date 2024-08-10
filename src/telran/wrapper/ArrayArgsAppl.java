package telran.wrapper;

public class ArrayArgsAppl {

	public static void main(String[] args) {

		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double res = calculator(a, b, args[2]);

		System.out.println(res);
	}

	public static double calculator(double a, double b, String oper) {
		switch (oper) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "x":
			return a * b;
		case "/":
			return a / b;
		case "%":
			return a % b;
		default:
			System.out.println("Wrong operation");
			return Double.NaN;
		}
	}

}
