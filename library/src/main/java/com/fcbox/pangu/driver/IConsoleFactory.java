/*
 * Copyright 2016-2017 HiveBox.
 */

package com.fcbox.pangu.driver;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * Console工厂, 供应商需要实现该接口.
 */
@SuppressWarnings("ALL")
public interface IConsoleFactory {

    /**
     * 创建IConsole实例.
     *
     * @param context Context
     * @param logger  日志接口
     * @return IConsole实例
     */
    IConsole create(@NonNull Context context, @NonNull ILogger logger);
}
