public class ConvertS {

    public static void main (String[] args) {
        if (args.length != 1) {
	  System.out.println("Invalid input: only one argument is accepted (seconds)");
	  return;
        }

        int total_seconds;
        
        try {
	  total_seconds = Integer.parseInt(args[0]);
        } catch (NumberFormatException err) {
	  System.out.println("Invalid input value: provide an integer");
	  return;
        }
        int hour = total_seconds / 3600;
        int minutes = (total_seconds % 3600) / 60;
        int seconds = total_seconds % 60;

        System.out.printf("%d seconds = %d hour, %d minutes, and %d seconds", total_seconds, hour, minutes, seconds);
    }
}
