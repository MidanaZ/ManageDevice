package com.ailab.managedevice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Condition_bill {
    @Id
    private int id;
    public String status_bill;
    @OneToMany
    @JoinColumn(name ="condition_bill_id")
    private Set<Borrow_bill> brbill;
}
