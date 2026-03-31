import java.util.Scanner;
import java.util.ArrayList;

public class TwoSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int target;
        System.out.print("Type a target number: ");
        while(true) {
	  
	  if (!in.hasNextInt()) {
	      System.out.println("Invalid input: try an integer");
	      in.next();
	      continue;
	  }
	  
	  target = in.nextInt();
	  break;
        }
        
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

        int[] answer = compareNumbers(nums, target);

        if (answer[0] != -1) {
	  System.out.println("{" + answer[0] + ", " + answer[1] + "}");
        } else {
	  System.out.println("No answer could be found with the given list and target");
        }
        in.close();
    }

    public static int[] compareNumbers(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
	  for (int j = i + 1; j < nums.length; j++) {
	      if (nums[i] + nums[j] == target) {
		return new int[] {i, j};
	      }
	  }
        }
        return new int[] {-1, -1};
    }
}
