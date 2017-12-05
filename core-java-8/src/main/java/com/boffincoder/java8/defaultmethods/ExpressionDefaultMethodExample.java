package com.boffincoder.java8.defaultmethods;

/**
 * 
 * @author Amandeep Singh
 *
 */
public class ExpressionDefaultMethodExample {
	public static void main(String[] args) {
		Expression expression = new ConstantExpression(32.0d);
		System.out.println(expression.signum());
	}
}
