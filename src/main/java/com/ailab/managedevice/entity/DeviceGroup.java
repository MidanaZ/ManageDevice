package com.ailab.managedevice.entity;
import jakarta.persistence.*;


@Entity
@Table(name="device_group")
public class DeviceGroup {
    @Id
    private int id;
    @Column(name="group_name")
    private String groupName;

    public DeviceGroup(){}
    public DeviceGroup(int id, String groupName){
        this.id=id;
        this.groupName = groupName;
    }

    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="group_id",referencedColumnName = "id")
    private Set<Device> device;*/

}
