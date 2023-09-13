import java.util.Scanner;
public class CircleCalculation {
    public static void main(String[] args) {

        //initialized Scanner
        Scanner in = new Scanner(System.in);

        //declared variable and radius input user prompt
        System.out.println("Input the radius of the circle");
        double circleRadius = in.nextDouble();

        //outputs the diameter, area and circumference of the circle based on the radius
        System.out.printf("The Diameter of the circle is %.3f units\n", CalculateDiameter(circleRadius));
        System.out.printf("The Area of the circle is %.3f units\n", CalculateArea(circleRadius));
        System.out.printf("The Circumference of the circle is %.3f units", CalculateCircumference(circleRadius));
    }
    public static double CalculateDiameter(double circleRadius) {

        //returns diameter math
        return circleRadius * 2;
    }
    public static double CalculateArea(double circleRadius) {

        //area math
        return circleRadius * circleRadius * Math.PI;
    }
    public static double CalculateCircumference(double circleRadius) {

        //circumference math
        return circleRadius * 2 * Math.PI;
    }
}