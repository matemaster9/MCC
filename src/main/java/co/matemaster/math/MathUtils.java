package co.matemaster.math;

import java.util.Arrays;
import java.util.OptionalDouble;

/**
 * @author matemaster
 */
public class MathUtils {

    public static int fromLong(long number) {
        return Math.toIntExact(number);
    }

    public static double average(int... values) {
        if (values.length <= 1) {
            return values[0];
        }
        OptionalDouble average = Arrays.stream(values).average();
        return average.orElseThrow();
    }
}
