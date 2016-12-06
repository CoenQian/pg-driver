/*
 * Copyright 2016 HiveBox.
 */

package com.fcbox.pangu.driver;

/**
 * 驱动异常.
 */
@SuppressWarnings("ALL")
public class DriverException extends Exception {

    /** 错误码. */
    @ErrorCode
    private int mErrorCode;
    /** 错误描述. */
    private String mErrorMessage;

    public DriverException(@ErrorCode int errorCode, String errorMessage) {
        super(errorMessage);
        mErrorCode = errorCode;
        mErrorMessage = errorMessage;
    }

    @ErrorCode
    public int getErrorCode() {
        return mErrorCode;
    }

    public void setErrorCode(@ErrorCode int mErrorCode) {
        this.mErrorCode = mErrorCode;
    }

    public String getErrorMessage() {
        return mErrorMessage;
    }

    public void setErrorMessage(String mErrorMessage) {
        this.mErrorMessage = mErrorMessage;
    }
}
