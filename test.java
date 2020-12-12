package SecondTurn;

import java.time.LocalDate;
import java.util.Scanner;

public class test {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        LocalDate now = LocalDate.parse(sc.next());
        System.out.println(now);
    }
}
