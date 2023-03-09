import java.util.*;
public class SimpleCalculator {
	public static void main(String[] args) {
		display();
		askForProblem();
	}
	public static void askForProblem() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter 1st number:");
		double num1 = sc.nextDouble();
		System.out.println(" enter operator:");
		String op = sc.next();
		System.out.println(" enter 2nd number:");
		double num2 = sc.nextDouble();
		double haha = rules(num1, num2, op);
		System.out.println(haha);
	}
	public static double rules(double num1, double num2, String op) {
		
		double answer = 0 ;
		
		if(op == "+") {
			answer = num1 + num2;
			return answer;
		} else if (op == "-") {
			answer = num1 - num2;
			return answer;
		} else if (op == "*") {
			answer = num1 * num2;
			return answer;
		} else if (op == "/"){
			answer = num1 / num2;
			return answer;
		} else {
			return answer;
		}

	}
	public static void display() {
		operators();
		System.out.println();
		row1();
		row2();
		row3();
		row4();
	}
	public static void operators() {
		System.out.print("  +  |");
		System.out.print("  -  |");
		System.out.print("  *  |");
		System.out.print("  /  |");
	}
	public static void row1() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print("  ");
				if(j == 0) {
					System.out.print(i +7);
				}
			}
			System.out.print("|");
		}
		System.out.println();
	}
	public static void row2() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print("  ");
				if(j == 0) {
					System.out.print(i +4);
				}
			}
			System.out.print("|");
		}
		System.out.println();
	}
	public static void row3() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print("  ");
				if(j == 0) {
					System.out.print(i +1);
				}
			}
			System.out.print("|");
		}
		System.out.println();
	}
	public static void row4() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print("  ");
				if(j == 0) {
					System.out.print(j);
				}
			}
			System.out.print("|");
		}
		System.out.println();
	}
}
