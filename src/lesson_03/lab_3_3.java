package lesson_03;

public class lab_3_3 {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 28, 16};
        int[] expected_result = new int[intArr.length];
        int n = 5;
        for (int a = 0; a < expected_result.length; a++) {
            int min = intArr[0];
            int k, j;
            for (int i = 0; i < n; i++) {
                if (min <= intArr[i]) {
                    min = min;
                } else {
                    min = intArr[i];
                }
            }

            expected_result[a] = min;
            for (j = k = 0; k < n; k++) {
                if (intArr[k] != min) {
                    intArr[j] = intArr[k];
                    j++;

                }
            }
            n = j;
        }
        for (int b = 0; b < expected_result.length; b++) {
            System.out.print(expected_result[b] + "\t");
        }
    }
}
