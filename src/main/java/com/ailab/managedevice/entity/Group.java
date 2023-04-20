package com.ailab.managedevice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;


@Entity
@Table(name="group_device")
public class Group {
    @Id
    private int id;
    @Column(name="name_group")
    private String nameGroup;

    public Group(){}
    public Group(int id, String nameGroup){
        this.id=id;
        this.nameGroup=nameGroup;
    }

    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="group_id",referencedColumnName = "id")
    private Set<Device> device;*/

}
