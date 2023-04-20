package com.ailab.managedevice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "condition_bill")
public class Condition_bill {
    @Id
    private int id;
    @Column(name = "status_bill")
    public String statusBill;
    @OneToMany
    @JoinColumn(name ="condition_bill_id")
    private Set<Borrow_bill> brbill;
}
