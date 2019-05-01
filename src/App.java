import java.text.DecimalFormat;
import java.text.NumberFormat;

import static java.lang.Math.cos;
import static java.lang.Math.cosh;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class App {
    private static NumberFormat formatter = new DecimalFormat("#0.000");
    private static double[] defs = {1.875, 4.694, 7.855, 10.996, 14.137, 17.279, 20.420, 23.562, 26.704, 29.845};

    public static void main(String[] args) {
//        for (double i = 0; i < 30; i += 0.00001){
//            equal(i);
//        }
        for (int i = 0; i < defs.length - 1; i++) {
            System.out.println(formatter.format(pow(defs[i + 1], 2) / pow(defs[i], 2)));
        }
    }

    private static double f(double x){
        return cos(x);
    }

    private static double g(double x){
        return -1 / cosh(x);
    }

    private static void equal(double x){
        double res = abs(g(x) - f(x));
        if (res < 0.0001){
            System.out.println(formatter.format(x));
        }
    }
}