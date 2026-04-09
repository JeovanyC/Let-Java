public class MultAdd {

    public static void main(String[] args) {
        if (args.length != 3) {
	  System.out.println("Invalid input value: provide three integer");
	  return;
        }
        double pi = Math.PI;
        
        double a, b, c;
        try {
	  a  = Double.parseDouble(args[0]);
	  b = Double.parseDouble(args[1]);
	  c = Double.parseDouble(args[2]};
        } catch (NumberFormatException err) {
	  System.out.println("Invalid input value: provide three integer");
	  return;
        }

        System.out.println(multAdd(1.0, 2.0, 3.0));
        System.out.println(multAdd(2.0, 3.0, 4.0));
        System.out.println(multAdd(5.0, 0.5, 1.0));
        System.out.println(multAdd(10.0, -1.0, 2.0));

        System.out.println(multAdd(Math.cos(pi/4), 0.5, Math.sin(pi/4)));
        System.out.println(multAdd(1, Math.log(10), Math.log(20)));

        System.out.println(expSum(1));
    }

    public static double multAdd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        double exp = Math.exp(-x);
        return multAdd(x, exp, Math.sqrt(1 - exp));
    }
}
