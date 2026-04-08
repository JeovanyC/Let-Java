public class IsDivisible{

    public static void main(String[] args) {
        if (args.length != 3) {
	  System.out.println("Invalid input value: provide three integer");
	  return;
        }

        int a, b, c;
        try {
	  a  = Integer.parseInt(args[0]);
	  b = Integer.parseInt(args[1])
	  c = Integer.parseInt(args[2);
        } catch (NumberFormatException err) {
	  System.out.println("Invalid input value: provide three integer");
	  return;
        }

        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;

        System.out.println(sum - max > max);
        in.close();
    }
}
