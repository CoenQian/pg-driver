/*
 * Copyright 2016 HiveBox.
 */

package com.fcbox.pangu.driver;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.fcbox.pangu.driver.ErrorCode.ERROR;
import static com.fcbox.pangu.driver.ErrorCode.HARDWARE_NO_RESPONSE;
import static com.fcbox.pangu.driver.ErrorCode.PARAM_INVALID;
import static com.fcbox.pangu.driver.ErrorCode.PARAM_MISSING;
import static com.fcbox.pangu.driver.ErrorCode.TIMEOUT;

/**
 * 错误码.
 */
@IntDef({ERROR, PARAM_MISSING, PARAM_INVALID, HARDWARE_NO_RESPONSE, TIMEOUT})
@Retention(RetentionPolicy.SOURCE)
@SuppressWarnings("ALL")
public @interface ErrorCode {
// 通用 [0, 1000)
// ---------------------------------------------------------------------------------------------------------------------

    /** 错误，在其他错误码无法准确表达意义时使用. */
    int ERROR = 0;
    /** 缺失参数. */
    int PARAM_MISSING = 1;
    /** 无效参数. */
    int PARAM_INVALID = 2;
    /** 硬件设备无响应. */
    int HARDWARE_NO_RESPONSE = 3;
    /** 超时无响应，例如RFID没有收到数据. */
    int TIMEOUT = 4;

// 软件模块 [1000, 2000)
// ---------------------------------------------------------------------------------------------------------------------


// 柜机信息模块 [2000, 3000)
// ---------------------------------------------------------------------------------------------------------------------


// 格口模块 [3000, 4000)
// ---------------------------------------------------------------------------------------------------------------------


// RFID模块 [4000, 5000)
// ---------------------------------------------------------------------------------------------------------------------


//  条码扫描器模块 [5000, 6000)
// ---------------------------------------------------------------------------------------------------------------------


//  灯箱模块 [6000, 7000)
// ---------------------------------------------------------------------------------------------------------------------


//  打印机模块 [7000, 8000)
// ---------------------------------------------------------------------------------------------------------------------

}
