import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputString = sc.nextLine().split(" ");
        int a = Integer.parseInt(inputString[0]);
        int b = Integer.parseInt(inputString[1]);

        int rectLength = a * 2 + b * 2;
        int rectArea = a * b;

        System.out.println(rectArea + " " + rectLength);
    }
}