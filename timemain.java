import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Scanner;

public class timemain {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)) {

        System.out.println("-----:AVAILABLE TIME ZONES:-----");
        System.out.println("--------------------------------");
        ZoneId.getAvailableZoneIds().stream()
        .sorted()
        .forEach(System.out::println);

        System.out.println("--------------------------------");
        System.out.print("WRITE A CAPITAL: <Continent/City> : ");
        ZoneId zone = ZoneId.of(input.nextLine());

        LocalTime time = LocalTime.now(zone);

        System.out.println("Current time in "+zone+ " is: " +time);
        }
    
    }
}
