package test.example.demo.util;

/**
 * The Class MockException.
 */
public class MockException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new mock exception.
     */
    public MockException() {
        super();
    }

    /**
     * Instantiates a new mock exception.
     *
     * @param message
     *            the message
     */
    public MockException(String message) {
        super(message);
    }

    /**
     * Instantiates a new mock exception.
     *
     * @param message
     *            the message
     * @param cause
     *            the cause
     */
    public MockException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new mock exception.
     *
     * @param cause
     *            the cause
     */
    public MockException(Throwable cause) {
        super(cause);
    }

}