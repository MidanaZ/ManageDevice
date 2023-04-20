package com.ailab.managedevice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name="device")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String id_device;
    private String name_device;
    private Date date_buy;
    private Date expire_date_warranty;
    private String image;
    private Boolean is_delete;

    public Device(){}

    public Device(int id, String id_device, String name_device, Date date_buy, Date expire_date_warranty, String image){
        this.id = id;
        this.id_device = id_device;
        this.name_device = name_device;
        this.date_buy = date_buy;
        this.expire_date_warranty = expire_date_warranty;
        this.image = image;
        //this.is_delete = is_delete;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getId_device(){
        return id_device;
    }
    public void setId_device(String id_device){
        this.id_device = id_device;
    }
    public String getName_device (){
        return name_device;
    }
    public void setName_device(String name_device){
        this.name_device = name_device;
    }
    public Date getDate_buy (){
        return date_buy;
    }
    public void setDate_buy (Date date_buy){
        this.date_buy = date_buy;
    }
    public Date getExpire_date_warranty (){
        return expire_date_warranty;
    }
    public void setExpire_date_warranty(Date expire_date_warranty){
        this.expire_date_warranty = expire_date_warranty;
    }
    public String getImage (){
        return image;
    }
    public void setImage (String image){
        this.image = image;
    }
    /*public Boolean getIs_delete (){
        return is_delete;
    }
    public void setIs_delete (Boolean is_delete){
        this.is_delete =is_delete;
    }*/


}
