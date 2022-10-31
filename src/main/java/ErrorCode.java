/**
 * @author matemaster
 */
public enum ErrorCode {

    Error(1),
    Info(2),
    Debug(3),
    Fetch(4),

    Unknown(5);

    private final int code;

    ErrorCode(int code) {
        this.code = code;
    }
}
