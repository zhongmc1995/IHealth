package com.onion.entity;


/**
 * Created by lhd on 2017/5/4.
 * 地址信息
 */
public class Address {

    /**
     * 地址标识
     */
    private String id;

    /**
     * 国家
     */
    private String country;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 街道
     */
    private String street;

    /**
     * 邮编
     */
    private String postCode;

    public Address(String param){
        String str[] = param.split("-");
        this.country = str[0];
        this.province = str[1];
        this.city = str[2];
        this.street = str[3];
    }

    public String getStringAsPhone(){
        return country+"-"+province+"-"+city+"-"+street;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }


}
