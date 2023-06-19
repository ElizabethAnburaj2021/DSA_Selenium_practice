package mandatoryHomeWorks.Week5.Day1;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class UnableToEatLunch_LC1700 {
	@Test
	 public void example() {
	        int[] students = {1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0};
	        int[] sandwiches = {1, 0, 0, 0, 1, 1, 0, 0, 0, 1};

	        int unableToEat = countStudents(students, sandwiches);
	        System.out.println("Number of students unable to eat lunch: " + unableToEat);
	    }
	/*
	 * Pseudo code
	 * 1. The countStudents method takes these arrays as input and returns the number of students unable to eat lunch.
	 * 2. Create two queues, studentQueue and sandwichQueue, to store the students and sandwiches, respectively.
	 * 3. Iterate through the students array and add each student to the studentQueue. 
	 * 4. Iterate through the sandwiches array and add each sandwich to the sandwichQueue.
	 * 5. Initialize unableToEat as 0, which will keep track of the number of students unable to eat.
	 * 6. Track of numAttempts, which represents the number of unsuccessful attempts to match a student with a sandwich.
	 * 7. Traverse the loop-> while loop, we continue the process until either all students have been served or the number of attempts reaches the total number of students.
	 * 8. Traverse loop-> For each iteration, we check the preference of the current student and the type of the sandwich at the front of the sandwichQueue. 
	 * 9. If they match, we remove the student from the studentQueue, remove the sandwich from the sandwichQueue, and reset the number of attempts.
	 * 10. If they don't match, we put the student back at the end of the studentQueue and increment the number of attempts.
	 * 11. Increment unableToEat in each iteration, regardless of whether a student is served or not.
	 * 12. Finally, we return the number of students still remaining in the studentQueue, 
	 * which represents the number of students unable to eat lunch.
	 * 
	 */
	 private static int countStudents(int[] students, int[] sandwiches) {
	        Queue<Integer> studentQueue = new LinkedList<>();
	        Queue<Integer> sandwichQueue = new LinkedList<>();

	        for (int student : students) {
	            studentQueue.offer(student);
	        }

	        for (int sandwich : sandwiches) {
	            sandwichQueue.offer(sandwich);
	        }

	        int unableToEat = 0;
	        int numAttempts = 0;

	        while (!studentQueue.isEmpty() && numAttempts < studentQueue.size()) {
	            int currentStudent = studentQueue.poll();
	            int currentSandwich = sandwichQueue.peek();

	            if (currentStudent == currentSandwich) {
	                sandwichQueue.poll();
	                numAttempts = 0; // Reset the number of attempts
	            } else {
	                studentQueue.offer(currentStudent);
	                numAttempts++;
	            }

	            unableToEat++;
	        }

	        return studentQueue.size(); // Number of students still in the queue
	    }
}
