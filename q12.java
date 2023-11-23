public class q12 {
    public static void main(String args[]) {
        int max=0;
        int[][] arr = { { 1, 3, 4 }, { 2, 45, 3 }, { 98, 56, 43 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if(max<arr[i][j]){
                max=arr[i][j];
               }
            }
        }
        System.out.print("the maximum value is:");
        System.out.print(max);
    }

}
