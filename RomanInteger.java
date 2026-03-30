import java.util.Scanner;

import java.util.Map;
import java.util.HashMap;

public class RomanInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String roman_regex = "^M{0,3}(CM|CD|D?C{0,3})"
                             + "(XC|XL|L?X{0,3})"
                             + "(IX|IV|V?I{0,3})$";

        String roman_number;
        while (true) {
	  System.out.print("Enter a roman number: ");
	  
	  roman_number = in.nextLine().toUpperCase();

	  if (!roman_number.matches(roman_regex)) {
	      System.out.println("Invalid roman number");
	      continue;
	  }
	  break;
        }

        int converted_roman = convertToInteger(roman_number);
        
        System.out.println(converted_roman);
        in.close();
    }

    private static int convertToInteger(String roman_number) {

        Map<Character, Integer> roman_map = new HashMap<>();

        roman_map.put('I', 1);
        roman_map.put('V', 5);
        roman_map.put('X', 10);
        roman_map.put('L', 50);
        roman_map.put('C', 100);
        roman_map.put('D', 500);
        roman_map.put('M', 1000);

        int total = 0;
        for (int i = 0; i < roman_number.length(); i++) {
	  int current_char = roman_map.get(roman_number.charAt(i));
	  
	  if (i < roman_number.length() - 1) {
	      int next_char = roman_map.get(roman_number.charAt(i + 1));

	      if (current_char < next_char) {
		total -= current_char;
	      } else {
		total += current_char;
	      }
	  } else {
	      total += current_char;
	  }
        }

        return total;
    }
}
