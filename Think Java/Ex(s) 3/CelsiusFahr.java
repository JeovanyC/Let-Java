public class CelsiusFahr {

    public static void main (String[] args) {
        if (args.length != 1) {
	  System.out.println("Invalid input: only one argument is accepted (Celsius)");
	  return;
        }
        
        double celsius = Double.parseDouble(args[0]);
        double fahr = celsius * 9/5 + 32;

        System.out.printf("%.1f C = %.1f F%n", celsius, fahr);
    }
}
