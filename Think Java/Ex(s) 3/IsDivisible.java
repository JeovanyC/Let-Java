public class IsDivisible{

    public static void main(String[] args) {
        if (args.length != 2) {
	  System.out.println("Invalid input value: provide two integer");
	  return;
        }
        
        int n, m;
        try {
	  n = Integer.parseInt(args[0]);
	  m = Integer.parseInt(args[1]);
        } catch (NumberFormatException err) {
	  System.out.println("Invalid input value: provide two integer");
	  return;
        }

        if (m == 0) {
	  System.out.println("Division by zero is not allowed");
	  return;
        }

        System.out.println(n % m == 0);
    }
}
