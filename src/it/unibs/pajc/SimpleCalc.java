package it.unibs.pajc;

public class SimpleCalc {
    public static void main(String[] args) {
        double a = 3;
        double b = 7;

        OperatoriBinari somma = new OperatoriBinari() {
            @Override
            public double eval(double a, double b) {
                return a+b;
            }
        };
        OperatoriBinari prodotto = new OperatoriBinari() {
            @Override
            public double eval(double a, double b) {
                return a*b;
            }
        };
        double res = somma.eval(a, b);

        System.out.printf("%f\n", res);
    }
}
