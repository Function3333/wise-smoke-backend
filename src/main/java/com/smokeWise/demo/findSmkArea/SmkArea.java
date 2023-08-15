package com.smokeWise.demo.findSmkArea;

public class SmkArea {

    //Field
    private String smkAreaId;
    private String smkAreaName;
    private String smkAddr;
    private String smkAreaDesc; //흡연구역 범위 상세
    private double smkLatitude;
    private double smkLongitude;

    //Constructor
    public SmkArea(){

    }

    public String getSmkAreaId() {
        return smkAreaId;
    }

    public void setSmkAreaId(String smkAreaId) {
        this.smkAreaId = smkAreaId;
    }

    public String getSmkAreaName() {
        return smkAreaName;
    }

    public void setSmkAreaName(String smkAreaName) {
        this.smkAreaName = smkAreaName;
    }

    public String getSmkAddr() {
        return smkAddr;
    }

    public void setSmkAddr(String smkAddr) {
        this.smkAddr = smkAddr;
    }

    public String getSmkAreaDesc() {
        return smkAreaDesc;
    }

    public void setSmkAreaDesc(String smkAreaDesc) {
        this.smkAreaDesc = smkAreaDesc;
    }

    public double getSmkLatitude() {
        return smkLatitude;
    }

    public void setSmkLatitude(double smkLatitude) {
        this.smkLatitude = smkLatitude;
    }

    public double getSmkLongitude() {
        return smkLongitude;
    }

    public void setSmkLongitude(double smkLongitude) {
        this.smkLongitude = smkLongitude;
    }
}
