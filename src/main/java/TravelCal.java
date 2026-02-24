import java.util.Scanner;

public class TravelCal {
    public static double calculateTime(double distance,double speed) {
        return distance / speed;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in kilometers:");
        double distance = scanner.nextDouble();
        System.out.println("Enter speed in kilometers per hour:");
        double speed = scanner.nextDouble();

        double time = calculateTime(distance, speed);
        System.out.println("Time taken to cover " + distance + " km at " + speed + " km/h is: " + time + " hours");
    }
}
