package com.example.coolweather2.db;

import org.litepal.crud.DataSupport;

/**
 * 功能描述: 省级表
 * 时　　间: 2018/6/22.13:45
 * 作    者: maijiawen
 * 版本信息: V1.0.0
 **/
public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

