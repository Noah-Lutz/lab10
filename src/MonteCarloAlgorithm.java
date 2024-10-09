import javax.swing.*;

public class MonteCarloAlgorithm {

    public static void main(String[] args) {
        // Prompt for user input.
        long points = Long.parseLong(JOptionPane.showInputDialog("Please enter the number of points to use in the calculation."));

        // Calculate how many points fall within the quarter of the circle.
        long pointsInside = 0;
        for (long i = 0; i < points; i++) {
            double x = Math.random(), y = Math.random();
            double x2 = Math.pow(x, 2), y2 = Math.pow(y, 2);
            if (x2 + y2 <= 1) pointsInside++;
        }

        // Algorithm from lab document.
        double pi = ((double) pointsInside / points) * 4;

        // Print output concisely.
        System.out.println("The approximation of PI based on " + points + " points is:");
        System.out.println(pi);
    }
}
