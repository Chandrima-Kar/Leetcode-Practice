package interview;
import java.util.*;

public class puzzle {
    public static int combinationSum(int[] pieces, int magicNumber) {
    Arrays.sort(pieces); // Sort the array to handle duplicates easily
    List<List<Integer>> result = new ArrayList<>();
    findCombinations(pieces, magicNumber, 0, new ArrayList<>(), result);
    return result.size(); // Return the number of unique combinations
  }

  private static void findCombinations(int[] pieces, int magicNumber, int start, List<Integer> currentCombination,
      List<List<Integer>> result) {
    if (magicNumber == 0) {
      result.add(new ArrayList<>(currentCombination)); // Found a valid combination
      return;
    }
    for (int i = start; i < pieces.length; i++) {
      // Skip duplicates
      if (i > start && pieces[i] == pieces[i - 1])
        continue;

      if (pieces[i] > magicNumber)
        break; // No point in continuing if the number is larger than the target

      currentCombination.add(pieces[i]);
      findCombinations(pieces, magicNumber - pieces[i], i + 1, currentCombination, result); // Move to next piece
      currentCombination.remove(currentCombination.size() - 1); // Backtrack
    }
  }

  public static void main(String[] args) {
    int[] pieces = { 10, 1, 2, 7, 6, 1,5 };
    int magicNumber = 8;
    if (magicNumber == 0)
      System.out.println("Number of unique combinations: " + 0);
    else
      System.out.println("Number of unique combinations: " + combinationSum(pieces, magicNumber));
  }
}
