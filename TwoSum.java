import java.util.Scanner;
import java.util.ArrayList;

public class ContainsDuplicate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        ArrayList<Integer> dynamic_nums = new ArrayList<>();

        System.out.print("Type numbers to list: (Q to STOP)");
        while(true) {
	  if (in.hasNextInt()) {
	      dynamic_nums.add(in.nextInt());
	  } else {
	      String temp = in.next();

	      if (temp.equalsIgnoreCase("Q")) {
		break;
	      }
	      System.out.println("Invalid input: try an integer");
	  }
        }
        int [] nums = dynamic_nums.stream().mapToInt(i -> i).toArray();

        boolean answer = checkNumbers(nums, to_compare);

        System.out.println(answer);
    }

    public static boolean checkNumbers(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
	  for (int j = i + 1; j < nums.length; j++) {
	      if (nums[i] == nums[j]) {
		return true;
	      }
	  }
        }
        return false;
    }
}
