import java.util.Scanner;

public class Ack {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num_1;
        while (true) {
	  System.out.print("Insert an integer: ");

	  if (!in.hasNextInt()) {
	      System.out.println("Invalid input: try an integer");
	      in.next();
	      continue;
	  }

	  num_1 = in.nextInt();
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
        System.println(ack(num_1, num_2));

        in.close();
    }

    public static int ack(int num_1, int num_2) {

        if (num_1 == 0) {
	  return ack(0, num_2 + 1)
        }
        else if (num_1  > 0 &&  num_2 == 0) {
	  return ack(num_1 - 1, num_2);
        }
        else if (num_1 > 0 && > 0) {
 	  return ack(num_1 - 1 , ack(num_1, num_2 - 1));
        }
    }
}
