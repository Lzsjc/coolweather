package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Lin on 2017/11/14.
 */

public class Provice extends DataSupport {
    private int id;
    private String privaceName;
    private int privaceCode;

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getPrivaceName(){
        return privaceName;
    }
    public void setPrivaceName(String privaceName){
        this.privaceName = privaceName;
    }
    public int getPrivaceCode(){
        return privaceCode;
    }
    public void setPrivaceCode(int privaceCode){
        this.privaceCode = privaceCode;
    }
}
