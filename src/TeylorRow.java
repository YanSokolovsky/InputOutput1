
public class TeylorRow {
    static double epsilond(int k) {
        double g = 1;
        for (int i = 0; i < k; i++) {
            g = g / 10;
        }
        return g;
    }

    static double calcCos(int k, double x) {
        int numberForFactorial = 1;
        double epsi = epsilond(k);
        double chlen = 1;
        double row = 0;
        while (Math.abs(chlen) >= epsi) {
            row = row + chlen;
            chlen = chlen * x * x * (-1) / numberForFactorial / (numberForFactorial + 1);
            numberForFactorial += 2;
        }
        return row;
    }

    static double compar(int k, double x) {
        double kanon = Math.cos(x);
        double result;
        result = Math.abs(calcCos(k, x) - kanon);
        return result;
    }
}
