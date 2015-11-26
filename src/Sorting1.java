/**
 * Created by Sandeep on 11/26/2015.
 */
public class Sorting1 {

    public static int lowestNumber(int[] matrix) throws EmptyArrayException {
        if (matrix.length == 0) {
            throw new EmptyArrayException("Empty array found");
        }
        int min = matrix[0];
        for (int i = 0; i < matrix.length; i++) {
            if (min > matrix[i]) {
                min = matrix[i];
            }
        }

        return min;
    }

    public int[] sort(int[] matrix) throws EmptyArrayException {
        if (matrix.length == 0) {
            throw new EmptyArrayException("Empty array exception");
        }
        int a = lowestNumber(matrix);
        int q = 0;
        int matrixCounter = 0;
        int[] copy = new int[matrix.length];
        while (true) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i] == a) {
                    copy[q] = a;
                    matrixCounter++;
                    q++;
                }
            }
            a++;
            if (matrixCounter == matrix.length) {
                break;
            }
        }
        return copy;
    }

}
