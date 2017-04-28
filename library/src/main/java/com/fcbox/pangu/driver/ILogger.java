/*
 * Copyright 2016-2017 HiveBox.
 */

package com.fcbox.pangu.driver;

import android.support.annotation.NonNull;

/**
 * 日志接口，丰巢实现该接口.
 */
@SuppressWarnings("ALL")
public interface ILogger {

    /**
     * Debug日志.
     *
     * @param message 日志内容
     */
    void d(@NonNull String message);

    /**
     * Info日志.
     *
     * @param message 日志内容
     */
    void i(@NonNull String message);

    /**
     * Error日志.
     *
     * @param message 日志内容
     */
    void e(@NonNull String message);

    /**
     * Error日志.
     *
     * @param message   日志内容
     * @param throwable 异常
     */
    void e(@NonNull String message, @NonNull Throwable throwable);
}
