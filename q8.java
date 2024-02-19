import java.util.Scanner;

import javax.xml.bind.SchemaOutputResolver;

public class q8 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name:");
        String name= sc.nextLine();
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.trim());//trims the spaces
        System.out.println(name.substring(2));// starts from the given number char to the end
        System.out.println(name.replace('s','t'));// starts from the given number char to the end
        System.out.println(name.substring(2,5));// starts from the given number char to
                                                                       // the end dosen't include the ending string
        System.out.println(name.startsWith("s"));//returs true if start with s;
        System.out.println(name.endsWith("s"));//returs true if end with s;
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("s",0));//tells the index of given char or string // start searching 0 position //
        System.out.println(name.equals("sumit"));
        System.out.println(name.equalsIgnoreCase("sumit"));
        System.out.println(name.indexOf('s'));3
             }
}
