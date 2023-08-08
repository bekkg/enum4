import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        while (1>0) {
            try {
                System.out.println("  Жазыныз: ");
                String word = scanner.nextLine();
                Days days = Days.valueOf(word.toUpperCase());
                switch (days) {
                    case MONDAY -> System.out.println(Days.MONDAY + " -  Жава сабак окууйм. ");
                    case TUESDAY -> System.out.println(Days.TUESDAY+  " -  Англис тили сабагын окуйм. ");
                    case WEDNESDAY -> System.out.println(Days.WEDNESDAY);
                    case THURSDAY -> System.out.println(Days.THURSDAY);
                    case FRIDAY -> System.out.println(Days.FRIDAY);
                    case SATURDAY -> System.out.println(Days.SATURDAY);
                    case SUNDAY -> System.out.println(Days.SUNDAY);
                }
            } catch (Exception e) {
                System.out.println(" Мындай жок. ");
                System.out.println();
            }
        }
    }
}