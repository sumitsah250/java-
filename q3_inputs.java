import java.util.Scanner;
public class q3_inputs {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a= sc.nextInt();
        boolean b1= sc.hasNextInt();
        System.out.println(b1);
        System.out.println("enter the number 2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("the sum of two number is");
        System.out.println(sum);
        String str =sc.nextLine();
        System.out.println(str);
    }
}