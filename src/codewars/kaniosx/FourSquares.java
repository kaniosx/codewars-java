package codewars.kaniosx;

import java.math.BigInteger;
import java.util.Arrays;

public class FourSquares {
    public static BigInteger[] GetRepresentation (BigInteger n)
    {
        BigInteger[] result = new BigInteger[4];
        result[0] = BigInteger.ZERO;
        result[1] = BigInteger.ZERO;
        result[2] = BigInteger.ZERO;
        result[3] = BigInteger.ZERO;

        for (BigInteger i = BigInteger.ZERO; i.multiply(i).compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            for (BigInteger j = i; j.multiply(j).compareTo(n.subtract(i.multiply(i))) <= 0; j = j.add(BigInteger.ONE)) {
                for (BigInteger k = j; k.multiply(k).compareTo(n.subtract(j.multiply(j)).subtract(i.multiply(i))) <= 0; k = k.add(BigInteger.ONE)) {
                    BigInteger l = n.subtract(k.multiply(k)).subtract(j.multiply(j)).subtract(i.multiply(i));
                    BigInteger lsq = l.sqrt();

                    if (l.equals(lsq.multiply(lsq))) {
                        result[0] = i;
                        result[1] = j;
                        result[2] = k;
                        result[3] = lsq;

                        return result;
                    }
                }
            }
        }

        return result;
    }
}
