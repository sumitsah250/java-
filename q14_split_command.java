import java.util.Arrays;

public class q14_split_command
{
    public static void main(String args[]){
        String name = "su:mit";

        String[] arr=name.split("\\+");//we use dobble //because + is also used for concatination
        String[] arr1=name.split(":",4);
        System.out.println("the value i want to get:"+Arrays.toString(arr));
        System.out.println("the value i want to get:"+Arrays.toString(arr1));
        System.out.println(arr1[1]);

    }
}
