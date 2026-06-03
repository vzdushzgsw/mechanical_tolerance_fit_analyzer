import java.util.Scanner;
public class Main
{
    static class Part
    {
        String name;
        double nomsize;
        double tolerance;
public Part(String name, double nomsize, double tolerance)
{
    this.name = name;
    this.nomsize = nomsize;
    this.tolerance = tolerance;
}
//Method to show the min/max range
public void displayLimits()
{
    double min = nomsize - tolerance;
    double max = nomsize + tolerance;
  System.out.println(name + "Limits : ["+ min + "mm" + max + "mm]");
}
}
//Main method
public static void main(String[] args)
{
   Scanner input = new Scanner(System.in);

 System.out.println("Enter Shaft name: ");
String name = input.nextLine();
 System.out.println("Enter nominal size: ");
double size = input.nextDouble();
 System.out.println("Enter tolerance: "); 
double tol = input.nextDouble();

//Create User defined Part
Part userPart = new Part(name, size, tol);
userPart.displayLimits();

input.close();
}
}
