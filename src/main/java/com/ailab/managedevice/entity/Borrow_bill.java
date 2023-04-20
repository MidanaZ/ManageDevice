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
    @Column(name = "id_device")
    private String idDevice;
    @Column(name = "borrwer")
    private String borrower;
    @Column(name = "name_device")
    private String nameDevice;
    @Column(name = "date_borrow")
    private Date dateBorrow;
    @Column(name = "date_return")
    private Date dateReturn;
    @Column(name = "description")
    private String description;
    @ManyToMany
    @JoinTable(name="device_has_borrow_bill",
            joinColumns = @JoinColumn(name="borrow_bill_id"),
            inverseJoinColumns = @JoinColumn(name="device_id")
    )
    private Set<Device> device;

}
