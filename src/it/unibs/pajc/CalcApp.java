package it.unibs.pajc;

import java.util.ArrayList;
import java.util.HashMap;

public class CalcApp {
    public static void main(String[] args) {

        HashMap<String, OperatoriBinari> operazioni = new HashMap<>();
        operazioni.put("+", (a,b) -> a+b);
        operazioni.put("-", (a,b) -> a-b);
        operazioni.put("*", (a,b) -> a*b);
        operazioni.put("x", (a,b) -> a*b);
        operazioni.put("/", (a,b) -> a/b);
        operazioni.put(":", (a,b) -> a/b);
        operazioni.put("^", Math::pow);

        double a = 1.0;
        double b = 2.0;
        String op = "^";
        OperatoriBinari operatori = operazioni.get(op);
        double res = operatori.eval(a,b);
        System.out.printf("%.2f %s %.2f = %.2f\n", a, op, b, res);


    }
}
