package com.ailab.managedevice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
@Data
@Entity
@Table(name="device")
public class Device {
    @Id
    private int id;
    @Column(name = "device_id")
    private String deviceId;
    @Column(name = "device_name")
    private String deviceName;
    @Column(name = "date_purchase")
    private Date datePurchase;
    @Column(name = "date_expiry")
    private Date dateExpiry;
    @Column(name = "image")
    private String image;
    @Column(name ="is_delete")
    private Boolean isDelete;
    @ManyToOne
    @JoinColumn(name = "group_id")
    public DeviceGroup deviceGroup;

    public Device(){}

    public Device(int id, String deviceId, String deviceName, Date datePurchase, Date dateExpiry, String image, Boolean isDelete){
        this.id = id;
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.datePurchase = datePurchase;
        this.dateExpiry = dateExpiry;
        this.image = image;
        this.isDelete = isDelete;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getDeviceId(){
        return deviceId;
    }
    public void setDeviceId(String deviceId){
        this.deviceId = deviceId;
    }
    public String getDeviceName(){
        return deviceName;
    }
    public void setDeviceName(String deviceName){
        this.deviceName = deviceName;
    }
    public Date getDatePurchase(){
        return datePurchase;
    }
    public void setDatePurchase(Date datePurchase){
        this.datePurchase = datePurchase;
    }
    public Date getDateExpiry(){
        return dateExpiry;
    }
    public void setDateExpiry(Date dateExpiry){
        this.dateExpiry = dateExpiry;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String Image){
        this.image = image;
    }
    public Boolean getIsDelete(){
        return isDelete;
    }
    public void setIsDelete(Boolean isDelete){
        this.isDelete = isDelete;
    }
}
