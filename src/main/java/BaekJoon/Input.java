package BaekJoon;
import java.util.Scanner;

public class Input {

    public void Q1000() {
        System.out.println("Hello World!!");

    }
    public void Q1001() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("a 입력");
        int a = scanner.nextInt();

        System.out.println("b 입력");
        int b = scanner.nextInt();

        System.out.println(a+b);

        scanner.close();



    }
}
