package com.ailab.managedevice.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;
import java.util.Set;

@Data
@Entity
@Table(name="borrow_slip")
public class BorrowSlip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "device_id")
    private String deviceId;
    @Column(name = "device_name")
    private String deviceName;
    @Column(name = "borrower")
    private String borrower;
    @Column(name = "date_borrow")
    private Date dateBorrow;
    @Column(name = "date_return")
    private Date dateReturn;
    @Column(name = "description")
    private String description;
    @ManyToMany
    @JoinTable(name="device_has_borrow_slip",
            joinColumns = @JoinColumn(name="borrow_slip_id"),
            inverseJoinColumns = @JoinColumn(name="device_id")
    )
    private Set<Device> device;

}
