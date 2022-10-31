import org.junit.Test;

import java.util.random.RandomGenerator;

/**
 * @author matemaster
 */
public class SwitchTest {

    @Test
    public void test() {
        System.out.println(CalendarUtil.isBigMonth(12));
    }

    @Test
    public void test1() {
        ErrorCode[] values = ErrorCode.values();
        RandomGenerator l32X64MixRandom = RandomGenerator.of("L32X64MixRandom");
        switch (values[l32X64MixRandom.nextInt(0, values.length)]) {
            case Info -> System.out.println(ErrorCode.Info.ordinal());
            case Error -> System.out.println(ErrorCode.Error.ordinal());
            case Debug -> System.out.println(ErrorCode.Debug.ordinal());
            case Fetch -> System.out.println(ErrorCode.Fetch.ordinal());
            default -> System.out.println(ErrorCode.Unknown.ordinal());
        }
    }
}
