package _01_HW_MaxMinPrimitivesApp;

public class maxMinPrimitivesApp {

	public static void main(String[] args) {

		result(args[0].toLowerCase());

	}

	public static void result(String oper) {
		switch (oper) {
		case "byte":
			System.out.println("Byte min: " + Byte.MIN_VALUE);
			System.out.println("Byte max " + Byte.MAX_VALUE);
			break;
		case "integer":
			System.out.println("Integer min: " + Integer.MIN_VALUE);
			System.out.println("Integer max: " + Integer.MAX_VALUE);
			break;
		case "short":
			System.out.println("Short min: " + Short.MIN_VALUE);
			System.out.println("Short max: " + Short.MAX_VALUE);
			break;
		case "long":
			System.out.println("Long min: " + Long.MIN_VALUE);
			System.out.println("Long max: " + Long.MAX_VALUE);
			break;
		case "char":
			System.out.println("Char min: " + (int)Character.MIN_VALUE);
			System.out.println("Char max: " + (int)Character.MAX_VALUE);
			break;
		case "float":
			System.out.println("Float min: " + Float.MIN_VALUE);
			System.out.println("Float Max: " + Float.MAX_VALUE);
			break;
		case "double":
			System.out.println("Double min: " + Double.MIN_VALUE);
			System.out.println("Double max: " + Double.MAX_VALUE);
			break;
		default:
			System.out.println("Wrong operation");

		}
	}

}
