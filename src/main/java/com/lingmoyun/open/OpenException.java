package com.lingmoyun.open;

/**
 * 异常.
 *
 * @author gwf@sjychina.com
 */
public class OpenException extends Exception {

    private int code;

    protected OpenException(int code, String message) {
        super(message);
        this.code = code;
    }

    public OpenException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
