/*
 * Copyright 2016-2017 HiveBox.
 */

package com.fcbox.pangu.driver;

import android.support.annotation.NonNull;

/**
 * 驱动异常.
 */
@SuppressWarnings("ALL")
public class DriverException extends Exception {

    /** 错误码. */
    @ErrorCode
    private int mErrorCode;
    /** 错误描述. */
    @NonNull
    private String mErrorMessage;

    public DriverException(@ErrorCode int errorCode, @NonNull String errorMessage) {
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

    @NonNull
    public String getErrorMessage() {
        return mErrorMessage;
    }

    public void setErrorMessage(@NonNull String mErrorMessage) {
        this.mErrorMessage = mErrorMessage;
    }
}
