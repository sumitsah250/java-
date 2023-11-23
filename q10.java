
class q10{
    public static void main(String args[]){
        int [][]arr;
        arr= new int [2][3];
        arr[0][0]=20;
        arr[1][0]=20;
        arr[0][1]=30;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
                System.out.print("  ");
            }
            System.out.println();
            
        }

    }
}