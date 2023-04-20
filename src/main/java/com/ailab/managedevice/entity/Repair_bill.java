package com.ailab.managedevice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Set;

@Data
@Entity
@Table(name="repair_bill")
public class Repair_bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String id_device;
    private Date date_repair;
    private String name_device;
    private String description;
    @ManyToMany
    @JoinTable(name="device_has_repair_bill",
        joinColumns = @JoinColumn(name = "repair_bill_id"),
        inverseJoinColumns = @JoinColumn(name = "device_id")
    )
    private Set<Device> device;

}
