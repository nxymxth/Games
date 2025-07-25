import java.util.Scanner;
// this is the simple calculator i have made while i practice the scnner class in java
public class Calcy {
    public static void main(String[] args) {
       try( Scanner nf = new Scanner(System.in);){
        System.out.println(" enter number 1");
        int a= nf.nextInt();
        System.out.println(" enter number 2");
        int b= nf.nextInt();
        int sum= a+b;
        int minus= a-b;
        int multiply = a*b;
        int div= a/b;
        int mod = a%b;
        System.out.println("modulus of two number is " +mod);
        System.out.println(" sum of two number is :"+sum);
        System.out.println("subtration of two number is "+minus);
        System.out.println("multiplication of two number is "+multiply);
        System.out.println("division of two number is "+div);
       }
    }
}
