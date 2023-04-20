package com.ailab.managedevice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Set;

@Data
@Entity
@Table(name="borrow_bill")
public class Borrow_bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String id_device;
    private String borrower;
    private String name_device;
    private Date date_borrow;
    private Date date_return;
    private String description;
    @ManyToMany
    @JoinTable(name="device_has_borrow_bill",
            joinColumns = @JoinColumn(name="borrow_bill_id"),
            inverseJoinColumns = @JoinColumn(name="device_id")
    )
    private Set<Device> device;

}
