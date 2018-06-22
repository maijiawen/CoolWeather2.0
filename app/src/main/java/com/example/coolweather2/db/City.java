package com.example.coolweather2.db;

import org.litepal.crud.DataSupport;

/**
 * 功能描述: 市级表
 * 时　　间: 2018/6/22.13:45
 * 作    者: maijiawen
 * 版本信息: V1.0.0
 **/
public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId; //记录当前市所属的省份的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}

