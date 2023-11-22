import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] resultOut = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        int[] resultln = new int[3];
        for (int i = 0; i < resultOut.length; i++) {
            resultln[i] = resultOut[i + 3];
            System.out.println(Arrays.toString(total(resultln)));
            }
    }

    public static int[] total(int[] result) {
        for (int i = 0; i < result.length; i++) {
            if (result[i] % 2 == 0) {
                result[i]++;
            }
        }
        return result;
    }
}



















