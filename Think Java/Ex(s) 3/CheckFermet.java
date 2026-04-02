import java.util.Scanner;
import java.util.ArrayList;

public class CheckFermet {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> nums_list= new ArrayList<>();
        System.out.print("Type 4 numbers (a, b, c, n): ");
        while (nums_list.size() < 4) {
	  
	  if (!in.hasNextInt()) {
	      System.out.println("Invalid input: try an integer value");
	      in.next();
	      continue;
	  }
	  nums_list.add(in.nextInt());
        }
        int [] nums = nums_list.stream().mapToInt(i -> i).toArray();

        boolean answer = checkFermet(nums);
        if (answer == true) {
	  System.out.println("Holy smokes, Fermat was wrong!");
        } else {
	  System.out.println("No, that doesn’t work.");
        }
        in.close();
    }

    private static boolean checkFermet(int[] nums) {
        // Fermet Theorem: a**n + b**n == c**n is false, besides n =< 2
        
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        int n = nums[3];

        long right_size = Math.pow(a, n) + Math.pow(b, n);
        long left_size = Math.pow(c, n);

        if (left_size == right_size) && n > 2) {
	  return true;
        } else {
	  return false;
        }
    }
}
