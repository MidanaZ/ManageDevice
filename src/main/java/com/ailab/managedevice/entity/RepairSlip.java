package com.ailab.managedevice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Set;

@Data
@Entity
@Table(name="repair_bill")
public class RepairSlip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "device_id")
    private String deviceId;
    @Column(name = "device_name")
    private String deviceName;
    @Column(name = "date_repair")
    private Date dateRepair;
    @Column(name = "description")
    private String description;
    @ManyToMany
    @JoinTable(name="device_has_repair_slip",
        joinColumns = @JoinColumn(name = "repair_slip_id"),
        inverseJoinColumns = @JoinColumn(name = "device_id")
    )
    private Set<Device> device;

}
