import java.util.Scanner;

public class IsDivisible{

    public static void main(String[] args) {
        if (args.length != 2) {
	  System.out.println("Invalid input value: provide two integer");
	  return;
        }
        
        Scanner in = new Scanner(in);

        int n;
        int m;
        try {
	  n = Integer.parseInteger(args[0]);
	  m = Integer.parseInteger(args[1]);
        } catch (NumberFormatException err) {
	  System.out.println("Invalid input value: provide two integer");
	  return;
        }

        if (m == 0) {
	  System.out.println("Division by zero is not allowed");
	  return;
        }

        System.out.println(n % m == 0);
        in.close()
    }
}
