import java.util.ArrayList;

public class OddNumbersSetB {
    public static void main(String[] args) {

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        // Find odd numbers between 1 and 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }

        // Display list of odd numbers
        System.out.println("List of odd numbers between 1 and 50:");
        System.out.println(oddNumbers);

        // First three minimum odd numbers
        int min1 = oddNumbers.get(0);
        int min2 = oddNumbers.get(1);
        int min3 = oddNumbers.get(2);

        // Last three maximum odd numbers
        int size = oddNumbers.size();
        int max1 = oddNumbers.get(size - 3);
        int max2 = oddNumbers.get(size - 2);
        int max3 = oddNumbers.get(size - 1);

        // Calculate average
        int sum = 0;
        for (int num : oddNumbers) {
            sum += num;
        }

        double average = (double) sum / oddNumbers.size();

        System.out.println("First Three Minimum Odd Numbers: " + min1 + ", " + min2 + ", " + min3);
        System.out.println("Last Three Maximum Odd Numbers: " + max1 + ", " + max2 + ", " + max3);
        System.out.println("Average of Odd Numbers: " + average);
    }
}