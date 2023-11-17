public class Main {
    public static void main(String[] args) {
        int[] unknown = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int  sum = 0;
        for (int element : unknown) {
            if (element % 2 == 0) {
                sum = element + 1;
                System.out.println(sum);
            }


        }
    }
}