package main;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static List<Integer> fibonacci() {
        List fibo = new ArrayList<>();
        for (int a = 0, b = 1, i = 0; i <= 350; b += a, a = b - a, i++) {
            fibo.add(a);
            if (a >= 350) {
                break;
            }
        }
        return fibo;
    }

    public static Boolean isFibonacci(Integer a) {
        return fibonacci().contains(a);
    }
}



