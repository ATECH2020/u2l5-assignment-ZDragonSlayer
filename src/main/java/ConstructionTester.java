import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      //creation of scanner object to get user input
        Scanner scanner = new Scanner(System.in);

      //creation of variables that hold as follows
        //tax rate
          System.out.println("Enter the sales tax rate: ");
          double taxRate = (scanner.nextDouble());
        //needed # of boards
          System.out.println("How many boards do you need? ");
          int numBoards = (scanner.nextInt());
        //needed # of windows
          System.out.println("How many windows do you need? ");
          int numWindows = (scanner.nextInt());
        //gross cost
          double grossCost;

      //create a Construction object to use for calculations
        Construction demo = new Construction(8, 11, taxRate);

      //finding the gross cost by computing the price without tax (calculated by the Construction class)
        grossCost = demo.lumberCost(numBoards) + demo.windowCost(numWindows);
      //print gross cost
        System.out.println("Total: " + grossCost);
      //print the net cost (calculated by the Construction class)
        System.out.println("Grand Total: " + demo.grandTotal(grossCost));
    }
}
