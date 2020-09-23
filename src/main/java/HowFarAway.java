import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
      //creation of scanner object to get user input
        Scanner scanner = new Scanner(System.in);

      //creation of varibles that holds as follows
        //starting values (latitude then longitude)
          System.out.print("Enter the latitude of the starting location: ");
          double startLat = scanner.nextDouble();
          System.out.print("Enter the longitude of the starting location: ");
          double startLong = scanner.nextDouble();
        //ending values  (latitude then longitude)
          System.out.print("Enter the latitude of the ending location: ");
          double endLat = scanner.nextDouble();
          System.out.print("Enter the longitude of the ending location: ");
          double endLong = scanner.nextDouble();

      //create two GeoLocation objects to use for calculation
        GeoLocation startLocation = new GeoLocation(startLat, startLong);
        GeoLocation endLocation = new GeoLocation(endLat, endLong);

      //compute and print the distance from startLocation and endLocation
        System.out.println("The distance is " + startLocation.distanceFrom(endLocation) + " miles.");
    }
}