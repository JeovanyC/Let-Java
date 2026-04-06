import java.util.Scanner;
import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(checkAnagram(
	  new String getString(),
	  new String getString()
        ));
        in.close();
    }
    
    private static char[] getString(Scanner in) {
        while (true) {
	  System.out.print("Enter a string to compare: ");
	  
	  if (in.hasNextLine()) {
	      return in.nextLine().toCharArray();
	  }
	  } else {
	      System.out.println("Invalid Input: try a string");
	      continue
	  }
        }
    }

    public static boolean checkAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] count = new int[256];
        
        for (char c : a.toCharArray()) count[c]++;
        for (char c : b.toCharArray()) count[c]++;

        for (int: count) if (i != 0) return false;
        return  true;
    }
}
