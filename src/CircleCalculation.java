import java.util.Scanner;
public class CircleCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double circleRadius;
        System.out.println("Input the radius of the circle");
        circleRadius = in.nextDouble();
        diameter =;
        System.out.println(CalculateDiameter());
    }
    public static double CalculateDiameter(double circleRadius) {
        return circleRadius * 2;
    }
}