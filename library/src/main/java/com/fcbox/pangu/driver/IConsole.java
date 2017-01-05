/*
 * Copyright 2016 HiveBox.
 */

package com.fcbox.pangu.driver;

import java.util.List;

import rx.Observable;

/**
 * 控制台接口, 供应商需要实现该接口.
 */
@SuppressWarnings("ALL")
public interface IConsole {

    /**
     * 获取版本信息.
     *
     * @return 版本信息
     */
    Observable<Version> getVersion();

    /**
     * 读取单柜编码.
     *
     * @return 单柜编码列表
     */
    Observable<List<String>> readPortionCodes();

    /**
     * 激活柜机.
     *
     * @param portionCodes 单柜编码列表
     */
    Observable<Void> activateLocker(List<String> portionCodes);

    /**
     * 获取柜机外部的温度数值.
     *
     * @return 柜机外部的温度数值，摄氏度
     */
    Observable<Integer> getLockerTemperature();

    /**
     * 获取柜机外部的湿度数值.
     *
     * @return 柜机外部的湿度数值，百分制
     */
    Observable<Integer> getLockerHumidity();

    /**
     * 打开单个格口.
     *
     * @param cellCode 格口编码
     * @return 格口的开关状态，true - 开启状态，false - 关闭状态
     */
    Observable<Boolean> openCell(String cellCode);

    /**
     * 批量打开格口.
     *
     * @param cellCodes 格口编码列表
     * @return 格口的开关状态列表，true - 开启状态，false - 关闭状态
     */
    Observable<List<Boolean>> openCells(List<String> cellCodes);

    /**
     * 读取格口的开关状态.
     *
     * @param cellCodes 格口编码列表
     * @return 格口的开关状态列表，true - 开启状态，false - 关闭状态
     */
    Observable<List<Boolean>> readCellStatuses(List<String> cellCodes);

    /**
     * /**
     * 格口红外检测.
     *
     * @param cellCodes 格口编码列表
     * @return 格口的储物状态列表，true - 占用状态，false - 空闲状态
     */
    Observable<List<Boolean>> cellsInfraredDetection(List<String> cellCodes);

    /**
     * 格口快照.
     *
     * @param dirPath   快照存储的目录路径
     * @param cellCodes 格口编码列表
     * @return 快照的路径列表
     */
    Observable<List<String>> cellsSnapshot(String dirPath, List<String> cellCodes);

    /**
     * 开启RFID的识别.
     *
     * @param duration 持续时间
     * @return 识别到的数据
     */
    Observable<String> startRfid(long duration);

    /**
     * 开启扫描仪的识别功能.
     *
     * @param duration 持续时间
     * @return 扫描到的数据
     */
    Observable<String> startScanner(long duration);

    /**
     * 控制灯箱开关.
     *
     * @param io 开/关
     */
    Observable<Void> light(@IO int io);

    /**
     * 静默安装指定路径的apk.
     *
     * @param apkPath apk的路径
     */
    Observable<Void> installApk(String apkPath);
}

