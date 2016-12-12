/*
 * Copyright 2016 HiveBox.
 */

package com.fcbox.pangu.driver;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.fcbox.pangu.driver.IO.OFF;
import static com.fcbox.pangu.driver.IO.ON;

/**
 * 开关.
 */
@IntDef({OFF, ON})
@Retention(RetentionPolicy.SOURCE)
@SuppressWarnings("ALL")
public @interface IO {
    /** 关. */
    int OFF = 0;
    /** 开. */
    int ON = 1;
}
