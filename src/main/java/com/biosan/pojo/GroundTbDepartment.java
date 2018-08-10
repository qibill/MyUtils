package com.biosan.pojo;

import java.math.BigDecimal;

public class GroundTbDepartment {
    private BigDecimal departmentid;

    private BigDecimal areaid;

    private String departmentname;

    private String telephone;

    private String description;

    private BigDecimal state;

    private BigDecimal departmentpid;

    private String code;

    private String departmenttype;

    private String flag;

    private BigDecimal deliverydid;

    private BigDecimal bloodcardnum;

    private BigDecimal bcdepartmentpid;

    private String items;

    private String pinyincode;

    private String fivecode;

    private String postcode;

    private String codeWeixin;

    public BigDecimal getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(BigDecimal departmentid) {
        this.departmentid = departmentid;
    }

    public BigDecimal getAreaid() {
        return areaid;
    }

    public void setAreaid(BigDecimal areaid) {
        this.areaid = areaid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getState() {
        return state;
    }

    public void setState(BigDecimal state) {
        this.state = state;
    }

    public BigDecimal getDepartmentpid() {
        return departmentpid;
    }

    public void setDepartmentpid(BigDecimal departmentpid) {
        this.departmentpid = departmentpid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDepartmenttype() {
        return departmenttype;
    }

    public void setDepartmenttype(String departmenttype) {
        this.departmenttype = departmenttype == null ? null : departmenttype.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public BigDecimal getDeliverydid() {
        return deliverydid;
    }

    public void setDeliverydid(BigDecimal deliverydid) {
        this.deliverydid = deliverydid;
    }

    public BigDecimal getBloodcardnum() {
        return bloodcardnum;
    }

    public void setBloodcardnum(BigDecimal bloodcardnum) {
        this.bloodcardnum = bloodcardnum;
    }

    public BigDecimal getBcdepartmentpid() {
        return bcdepartmentpid;
    }

    public void setBcdepartmentpid(BigDecimal bcdepartmentpid) {
        this.bcdepartmentpid = bcdepartmentpid;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items == null ? null : items.trim();
    }

    public String getPinyincode() {
        return pinyincode;
    }

    public void setPinyincode(String pinyincode) {
        this.pinyincode = pinyincode == null ? null : pinyincode.trim();
    }

    public String getFivecode() {
        return fivecode;
    }

    public void setFivecode(String fivecode) {
        this.fivecode = fivecode == null ? null : fivecode.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getCodeWeixin() {
        return codeWeixin;
    }

    public void setCodeWeixin(String codeWeixin) {
        this.codeWeixin = codeWeixin == null ? null : codeWeixin.trim();
    }

	@Override
	public String toString() {
		return "GroundTbDepartment [departmentid=" + departmentid + ", areaid=" + areaid
				+ ", departmentname=" + departmentname + ", telephone=" + telephone
				+ ", description=" + description + ", state=" + state + ", departmentpid="
				+ departmentpid + ", code=" + code + ", departmenttype=" + departmenttype
				+ ", flag=" + flag + ", deliverydid=" + deliverydid + ", bloodcardnum="
				+ bloodcardnum + ", bcdepartmentpid=" + bcdepartmentpid + ", items=" + items
				+ ", pinyincode=" + pinyincode + ", fivecode=" + fivecode + ", postcode=" + postcode
				+ ", codeWeixin=" + codeWeixin + "]";
	}
    
    
}