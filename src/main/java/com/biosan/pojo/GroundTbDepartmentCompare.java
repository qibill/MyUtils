package com.biosan.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class GroundTbDepartmentCompare {
    private BigDecimal id;

    private String hosnameOld;

    private String hoscodeOld;

    private String hoscodeNew;

    private String hosnameNew;

    private Date adddate;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getHosnameOld() {
        return hosnameOld;
    }

    public void setHosnameOld(String hosnameOld) {
        this.hosnameOld = hosnameOld == null ? null : hosnameOld.trim();
    }

    public String getHoscodeOld() {
        return hoscodeOld;
    }

    public void setHoscodeOld(String hoscodeOld) {
        this.hoscodeOld = hoscodeOld == null ? null : hoscodeOld.trim();
    }

    public String getHoscodeNew() {
        return hoscodeNew;
    }

    public void setHoscodeNew(String hoscodeNew) {
        this.hoscodeNew = hoscodeNew == null ? null : hoscodeNew.trim();
    }

    public String getHosnameNew() {
        return hosnameNew;
    }

    public void setHosnameNew(String hosnameNew) {
        this.hosnameNew = hosnameNew == null ? null : hosnameNew.trim();
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }
}