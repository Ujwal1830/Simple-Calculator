import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		do {
		System.out.println("1. ADD");
		System.out.println("2. SUB");
		System.out.println("3. MUL");
		System.out.println("4. DIV");
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		System.out.println("----Enter two numbers----");
		System.out.print("1st no. : ");
		int num1 = sc.nextInt();
		System.out.print("2nd no. : ");
		int num2 = sc.nextInt();
		
		Calculator calculator = new Calculator();
		switch(choice) {
		case 1:
			calculator.add(num1, num2);
			break;
		case 2:
			calculator.sub(num1, num2);
			break;
		case 3:
			calculator.mul(num1, num2);
			break;
		case 4:
			calculator.div(num1, num2);
			break;
		}
			
		System.out.println("Enter 1 if you want to continue ");
		System.out.println("OR");
		System.out.println("Enter any key to exit");
		n = sc.nextInt();
		}while(n == 1);
		sc.close();
	}
}
