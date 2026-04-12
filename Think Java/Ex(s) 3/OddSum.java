'import java.util.Scanner;

public class OddSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        while (true) {
	  System.out.print("Insert a positive odd integer: ");

	  if (!in.hasNextInt()) {
	      System.out.println("Invalid input: try a positive odd integer");
	      in.next();
	      continue;
	  }

	  num = in.nextInt();
	  
	  if (num <= 0 || num % 2 == 0) {
	      System.out.println("Invalid input: try a positive odd integer");
	      continue;
	  }
	  break;
        }
        System.println(oddSum(num));

        in.close();
    }

    public static int oddSum(int num_1) {
        if (num == 1) {
	  return num;
        }
        int sum = oddSum(num - 2);
        return sum;
    }
}
