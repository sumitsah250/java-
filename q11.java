public class q11 {
    public static void main(String args[]) {
        // float marks[] = { 12.0f + 14.24f + 253.0f + 33f };
        // float sum = 0;
        // for (int i = 0; i < marks.length; i++) {
        // sum = sum + marks[i];
        // }
        // System.out.println("the sum of marks is ");
        // System.out.println(sum);

        // }
        int[][] arr1 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int[][] arr2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
