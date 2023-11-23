import java.util.Scanner;
public class q4_pratice1{
    public static void main(String[] args)
{
    System.out.println("preparing greetings");
    System.out.println("enter name:");
    Scanner sc=new Scanner(System.in);
    String str= sc.nextLine();
    System.out.print("hello ");
    System.out.print(str);
    System.out.print(",have a nice day");
}
}