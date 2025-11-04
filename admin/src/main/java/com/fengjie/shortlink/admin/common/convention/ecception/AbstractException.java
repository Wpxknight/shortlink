package com.fengjie.shortlink.admin.common.convention.ecception;


import com.fengjie.shortlink.admin.common.convention.errorcode.IErrorCode;
import lombok.Getter;

@Getter
public class AbstractException extends RuntimeException {
    public final String errorCode;

    public final String errorMessage;

    public AbstractException(String message, Throwable throwable, IErrorCode errorCode) {
    //  throwable 是原始异常（可选，用于异常链追踪）。
        super(message, throwable);
        this.errorCode = errorCode.code();
        this.errorMessage = errorCode.message();
    }
}
