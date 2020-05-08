package Library.Exception;

import java.lang.Throwable;
public class PasswordError extends Exception {
    public PasswordError(String message) {
        super(message);
    }
}
