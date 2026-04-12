import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num_1;
        while (true) {
	  System.out.print("Insert a double: ");

	  if (!in.hasNextDouble()) {
	      System.out.println("Invalid input: try a double");
	      in.next();
	      continue;
	  }

	  num_1 = in.nextDouble();
	  break;
        }
        
        int num_2;
        while (true) {
	  System.out.print("Insert an integer: ");

	  if (!in.hasNextInt()) {
	      System.out.println("Invalid input: try an integer");
	      in.next();
	      continue;
	  }

	  num_2 = in.nextInt();
	  break;
        }
        System.out.println(power(num_1, num_2));

        in.close();
    }

    public static double power(double base, int exp) {

        if (exp == 0) {
	  return 1;
        } else if (exp < 0) {
	  return 1 / power(base, -exp);
        } else if (exp % 2 == 0) {
	  double half = power(base, exp / 2);
	  return half * half;
        } else {
	  return base * power(base, exp - 1);
        }
}
