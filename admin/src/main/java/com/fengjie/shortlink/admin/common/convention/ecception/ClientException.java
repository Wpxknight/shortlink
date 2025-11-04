package com.fengjie.shortlink.admin.common.convention.ecception;

import com.fengjie.shortlink.admin.common.convention.errorcode.BaseErrorCode;
import com.fengjie.shortlink.admin.common.convention.errorcode.IErrorCode;

import static com.fengjie.shortlink.admin.common.convention.errorcode.BaseErrorCode.*;

public class ClientException extends AbstractException {

    public ClientException(IErrorCode errorCode) {
        this(null, null, errorCode);
    }

    public ClientException(String message) {
        this(message, null, CLIENT_ERROR);
    }

    public ClientException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public ClientException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ClientException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}
