package com.asiainfo.core.model;

public class OrMerchant {
    private Integer id;

    private String merchantName;

    private String address;

    private String chargername;

    private String telphone;

    private String comment;

    public OrMerchant(Integer id, String merchantName, String address, String chargername, String telphone, String comment) {
        this.id = id;
        this.merchantName = merchantName;
        this.address = address;
        this.chargername = chargername;
        this.telphone = telphone;
        this.comment = comment;
    }

    public OrMerchant() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getChargername() {
        return chargername;
    }

    public void setChargername(String chargername) {
        this.chargername = chargername == null ? null : chargername.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}