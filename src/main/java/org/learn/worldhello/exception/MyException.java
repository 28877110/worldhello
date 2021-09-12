package org.learn.worldhello.exception;

/**
 * @Classname MyException
 * @Description TODO
 * @Date 2020-05-23 16:01
 * @Created by smallfish
 */
public class MyException extends RuntimeException {
    public String code;
    public String msg;

    public MyException() {
        super();
        this.code = "500";
        this.msg = "error";
    }

    public MyException(String message) {
        super(message);
        this.code = "500";
        this.msg = message;
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    protected MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
