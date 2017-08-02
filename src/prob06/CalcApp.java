package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			/*  코드를 완성 합니다 */
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split(" ");
			int leftValue = Integer.parseInt(tokens[0]);
			String operator = tokens[1];
			int rightValue = Integer.parseInt(tokens[2]);
			
			switch(operator) {
			case "+" : {
				Add add = new Add();
				add.setValue(leftValue,rightValue);
				int result = add.calculate();
				System.out.println(result);
				break;
			}
			case "-" : {
				Sub sub = new Sub();
				sub.setValue(leftValue,rightValue);
				int result = sub.calculate();
				System.out.println(result);
				break;
			}
			case "*" : {
				Mul mul = new Mul();
				mul.setValue(leftValue,rightValue);
				int result = mul.calculate();
				System.out.println(result);
				break;
			}
			case "/" : {
				Div div = new Div();
				div.setValue(leftValue,rightValue);
				int result = div.calculate();
				System.out.println(result);
				break;
			}
			}
		}
		
		scanner.close();

	}

}
