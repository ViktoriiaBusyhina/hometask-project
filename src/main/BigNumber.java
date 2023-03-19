package main;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigNumber {

    public static void main(String[] args) {

        long a = 124567544434442222L;

        BigInteger first = new BigInteger("3456789876543456789098765445678909876544567890987654567897777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
        BigInteger bigInteger = new BigInteger("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        BigInteger result = bigInteger.add(first);
        System.out.println(result);
        result = first.divide(bigInteger);

        System.out.println(bigInteger.negate());
        System.out.println(bigInteger.multiply(first));

        System.out.println(result);

        BigDecimal bigDecimal = new BigDecimal("34.2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        BigDecimal bigDecimalSecond = new BigDecimal("1.33333333333333");
        BigDecimal result1 = bigDecimal.divide(bigDecimalSecond, 10, RoundingMode.HALF_UP);
        System.out.println(result1);
        System.out.println(bigDecimal.multiply(bigDecimalSecond));


    }
}
