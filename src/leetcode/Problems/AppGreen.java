package src.leetcode.Problems;
import java.util.Scanner;
import java.util.ArrayList;

public class AppGreen {
  
  public static void main(String[] args) {
    // This is a sample code to use stdin and stdout.
    // Edit and remove this code as you like.

    String[] lines = getStdin();
    for (int i = 0, l = lines.length; i < l; i++) {
      String output = String.format("line[%s]: %s", i, lines[i]);
      // System.out.println(output);
    }
    Integer[] ans = greenest(lines);
    

    for (Integer num : ans) {
      System.out.println(num); 
    }
  }

  private static String[] getStdin() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> lines = new ArrayList<>();
    while (scanner.hasNext()) {
      lines.add(scanner.nextLine());
    }
    return lines.toArray(new String[lines.size()]);
  }

 private static Integer[] greenest(String[] lines){
    String inp = lines[1]; 
    String[] stringNums = inp.split(" "); 

    Integer[] nums = new Integer[stringNums.length]; 
    for (int i = 0; i < stringNums.length; i++) {
        nums[i] = Integer.parseInt(stringNums[i]); 
    }

    Integer maxFirst = Integer.MIN_VALUE;
    Integer maxSecond = Integer.MIN_VALUE;

    for (Integer number : nums) {
      if (number > maxFirst) {
        maxSecond = maxFirst;
        maxFirst = number;
      } else if (number > maxSecond && number <= maxFirst) {
        maxSecond = number;
      }
    }

    Integer[] ans = new Integer[nums.length];
    
    for (int i = 0; i < nums.length; i++) {
      if (nums[i].equals(maxFirst)) {
        ans[i] = maxSecond;
      } else {
        ans[i] = maxFirst;
      }
    }

    return ans;
  }
}
