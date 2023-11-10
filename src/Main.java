import CalkulatorPackage.BackPolishCalk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите выражение: ");
            System.out.println(BackPolishCalk.calculate(in.nextLine()));
        }
    }
}
