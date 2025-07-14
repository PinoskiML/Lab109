import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        System.out.println("Big decimal lab\n");

        BigDecimal originalBigDecimal = new BigDecimal("1000000000000");
        System.out.println("Original Big Decimal: " + originalBigDecimal);

        BigDecimal doubleBigDecimal = returnDoubleBigDecimal(originalBigDecimal);
        System.out.println("Double with 2 decimal points: " + doubleBigDecimal.setScale(2, RoundingMode.HALF_EVEN));


        BigDecimal reversedBigDecimal = bigDecimalReverser(originalBigDecimal);
        System.out.println("Reversed big decimal: " + reversedBigDecimal);


        //end of main
    }

    private static BigDecimal bigDecimalReverser(BigDecimal originalBigDecimal) {
        System.out.println("\nThis method reverses the sign of the a Big Decimal ");
        BigDecimal reversedBigDecimal = originalBigDecimal.negate();
        return reversedBigDecimal;
    }

    private static BigDecimal returnDoubleBigDecimal(BigDecimal originalBigDecimal) {
        System.out.println("\nThis method doubles a Big Decimal");
        BigDecimal doubler = new BigDecimal("2");
        BigDecimal doubleBigDecimal = originalBigDecimal.multiply(doubler);
        //System.out.println("debug checks if number is doubled. test number:" + originalBigDecimal + ", doubled: " +doubleBigDecimal);
        return doubleBigDecimal;
    }


}
