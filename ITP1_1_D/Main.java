import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());

        int hour = input / 3600;
        input %= 3600;
        int min = input / 60;
        input %= 60;

        System.out.println(hour + ":" + min + ":" + input);
    }
}