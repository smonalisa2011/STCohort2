import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number ranges from [1, 10^9] : ");

        double num  = in.nextDouble();

        if (num%2 == 0)
            System.out.println(num+" is even.");
        else
            System.out.println(num+" is odd.");
    }
}
