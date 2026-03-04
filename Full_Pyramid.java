public class Full_Pyramid {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}