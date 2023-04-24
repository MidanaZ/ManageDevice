package com.ailab.managedevice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "slip_condition")
public class SlipCondition {
    @Id
    private int id;
    @Column(name = "slip_status")
    public String slipStatus;
    @OneToMany
    @JoinColumn(name ="slip_condition_id")
    private Set<BorrowSlip> borrowSlip;
}
