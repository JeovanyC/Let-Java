public class CelsiusFahr {

    public static void main (String[] args) {
        if (args.length != 1) {
	  System.out.println("Invalid input: only one argument is accepted (Celsius)");
	  return;
        }

        try {
	  double celsius = Double.parseDouble(args[0]);
        } catch (NumberFormatException err) {
	  System.out.println("Invalid input value: provide an double");
	      return;
        }
        double fahr = celsius * 9/5 + 32;

        System.out.printf("%.1f C = %.1f F%n", celsius, fahr);
    }
}
