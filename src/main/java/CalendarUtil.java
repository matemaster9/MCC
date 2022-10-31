/**
 * @author matemaster
 */
public final class CalendarUtil {

    public static boolean isBigMonth(int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> true;
            default -> false;
        };
    }


}
