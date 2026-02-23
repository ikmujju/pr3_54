public class Pyramid {
    public static void main(String[] args) {
        int rows = 5;
        int num = 1;

        // Number part
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(num + " ");
                num++;

                if (num == 10)   // reset after 9
                {
                    num = 1;
                }
            }
            System.out.println();
        }

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}