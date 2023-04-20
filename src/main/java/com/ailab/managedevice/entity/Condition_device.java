package com.ailab.managedevice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name="condition_device")
public class Condition_device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String status;
    @OneToMany
    @JoinColumn(name = "condition_device_id")
    private Set<Device> device;

}
