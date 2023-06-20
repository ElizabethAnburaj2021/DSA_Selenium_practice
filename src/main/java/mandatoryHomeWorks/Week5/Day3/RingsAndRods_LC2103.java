package mandatoryHomeWorks.week5.day3;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RingsAndRods_LC2103 {
	@Test
    public void example() {
        int n = 3; // Number of rings
        int m = 4; // Number of rods

        List<List<Integer>> result = arrangeRingsAndRods(n, m);
        System.out.println("Possible arrangements of rings and rods:");
        for (List<Integer> arrangement : result) {
            System.out.println(arrangement);
        }
    }
/*
 * Pseudo code:
 * 1. The arrangeRingsAndRods method takes the number of rings n and rods m as input and returns a list of lists representing the possible arrangements.
 * 2. Initializing an empty list result to store the arrangements and an empty list currentArrangement to keep track of the current arrangement being constructed.
 * 3. The backtrack method takes the number of rings n, rods m, the result list, and the currentArrangement list as parameters.
 * 4. When the currentArrangement contains n rings. In this case, we add a copy of the currentArrangement to the result list and return.
 * 5. Iterate through the rods from 0 to m-1. We add the rod index to the currentArrangement and check if the current arrangement is valid using the isValid method.
 * 6. The isValid method checks if the last ring in the arrangement is placed on a new rod. It iterates through the previous rings in the arrangement and returns false if any of them are on the same rod as the last ring.
 * 7. We remove the last rod index from the currentArrangement to backtrack and explore other possibilities.
 * 8. Finally, we return the result list containing all the valid arrangements.
 */
    private static List<List<Integer>> arrangeRingsAndRods(int n, int m) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentArrangement = new ArrayList<>();

        backtrack(n, m, result, currentArrangement);
        return result;
    }

    private static void backtrack(int n, int m, List<List<Integer>> result, List<Integer> currentArrangement) {
        if (currentArrangement.size() == n) {
            result.add(new ArrayList<>(currentArrangement));
            return;
        }

        for (int i = 0; i < m; i++) {
            currentArrangement.add(i);
            if (isValid(currentArrangement)) {
                backtrack(n, m, result, currentArrangement);
            }
            currentArrangement.remove(currentArrangement.size() - 1);
        }
    }

    private static boolean isValid(List<Integer> arrangement) {
        int n = arrangement.size();
        int m = arrangement.get(n - 1);

        // Check if the last ring is placed on a new rod
        for (int i = n - 2; i >= 0; i--) {
            if (arrangement.get(i) == m) {
                return false;
            }
        }

        return true;
    }
}

