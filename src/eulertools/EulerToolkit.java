package eulertools;

import java.math.BigInteger;

public class EulerToolkit {
    public boolean isPrime(int n) { //Determines whether any int n is prime.
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        int m = (int)Math.round(Math.sqrt(n));
        
        for (int i = 3; i <= m; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
