package com.example.coolweather2.db;

import org.litepal.crud.DataSupport;

/**
 * 功能描述:县级表
 * 时　　间: 2018/6/22.13:54
 * 作    者: maijiawen
 * 版本信息: V1.0.0
 **/
public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weatherId;
    private int cityId; //记录当前县级所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
