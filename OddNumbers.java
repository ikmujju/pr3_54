import java.util.ArrayList;

public class OddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }

        // Display list of odd numbers
        System.out.println("List of odd numbers between 1 and 100:");
        System.out.println(oddNumbers);

        // Minimum odd number
        int min = oddNumbers.get(0);

        // Maximum odd number
        int max = oddNumbers.get(oddNumbers.size() - 1);

        // Sum of all odd numbers
        int sum = 0;
        for (int num : oddNumbers) {
            sum += num;
        }

        System.out.println("Minimum Odd Number: " + min);
        System.out.println("Maximum Odd Number: " + max);
        System.out.println("Sum of Odd Numbers: " + sum);
    }
}