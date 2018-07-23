package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @author Leader_xu
 * 用于存放省的数据信息
 */
public class Province extends DataSupport {
    private int id; //记录省份的id
    private String provinceName; //记录省份的名称
    private int provinceCode; //记录省份的代号

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
