/*
 * Copyright 2016 HiveBox.
 */

package com.fcbox.pangu.driver;

import android.support.annotation.NonNull;

/**
 * 版本信息.
 */
@SuppressWarnings("ALL")
public class Version {

    /** 版本号. */
    private final int mVerCode;
    /** 版本名. */
    @NonNull
    private final String mVerName;

    public Version(int verCode, @NonNull String verName) {
        this.mVerCode = verCode;
        this.mVerName = verName;
    }

    /**
     * 获取版本号.
     *
     * @return 当前版本号
     */
    public int getVerCode() {
        return mVerCode;
    }

    /**
     * 获取版本名.
     *
     * @return 当前版本名
     */
    @NonNull
    public String getVerName() {
        return mVerName;
    }
}
