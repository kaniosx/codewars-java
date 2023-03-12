package codewars.kaniosx;

import java.math.BigInteger;

public class Fibonacci {

    public static BigInteger fib(BigInteger n) {
        if (n.compareTo(new BigInteger("0")) == 0)
            return new BigInteger("0");
        if (n.compareTo(new BigInteger("1")) == 0)
            return new BigInteger("1");

        BigInteger fp = new BigInteger("0");
        BigInteger f = new BigInteger("1");

        for (
                BigInteger i = new BigInteger("0");
                i.compareTo(new BigInteger(String.valueOf(n.toString()))) == -1;
                i = i.add(new BigInteger("1"))
        ) {
            BigInteger tmp = fp.add(f);
            fp = f;
            f = tmp;
        }

        return f;
    }
}
