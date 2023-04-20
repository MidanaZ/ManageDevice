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
    @Column(name = "id_device")
    private String idDevice;
    @Column(name = "name_device")
    private String nameDevice;
    @Column(name = "date_buy")
    private Date dateBuy;
    @Column(name = "expire_date_warranty")
    private Date expireDateWarranty;
    @Column(name = "image")
    private String image;
    @Column(name ="is_delete")
    private Boolean isDelete;
    @ManyToOne
    @JoinColumn(name = "group_id")
    public Group group;

    public Device(){}

    public Device(int id, String idDevice, String nameDevice, Date dateBuy, Date expireDateWarranty, String image){
        this.id = id;
        this.idDevice = idDevice;
        this.nameDevice = nameDevice;
        this.dateBuy = dateBuy;
        this.expireDateWarranty = expireDateWarranty;
        this.image = image;
        //this.is_delete = is_delete;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getIdDevice(){
        return idDevice;
    }
    public void setIdDevice(String idDevice){
        this.idDevice = idDevice;
    }

    public String getNameDevice (){
        return nameDevice;
    }
    public void setNameDevice(String nameDevice){
        this.nameDevice = nameDevice;
    }

    public Date getDateBuy (){
        return dateBuy;
    }
    public void setDateBuy (Date dateBuy){
        this.dateBuy = dateBuy;
    }

    public Date getExpireDateWarranty (){
        return expireDateWarranty;
    }
    public void setExpireDateWarranty(Date expireDateWarranty){
        this.expireDateWarranty = expireDateWarranty;
    }

    public String getImage (){
        return image;
    }
    public void setImage (String image){
        this.image = image;
    }
    public Boolean getIsDelete (){
        return isDelete;
    }
    public void setIsDelete (Boolean isDelete){
        this.isDelete =isDelete;
    }


}
