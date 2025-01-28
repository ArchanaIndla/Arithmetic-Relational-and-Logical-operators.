import java.util.Scanner;
public class Reanloopr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println("Arithmatic operators: ");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println("Relational operators: ");
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println("Logical operators: ");
        System.out.println(a>b && a<b);
        System.out.println(a>b || a<b);
        System.out.println(!(a<b));
    }
}
