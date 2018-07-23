package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @author Leader_xu
 * 用于存放城市的数据信息
 */
public class City extends DataSupport {
    private int id; //记录城市的id
    private String cityName; //记录城市的名称
    private int cityCode; //记录城市的代号
    private int provinceId; //记录城市所属省份的id

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
