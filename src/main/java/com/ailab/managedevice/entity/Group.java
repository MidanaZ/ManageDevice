package com.ailab.managedevice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name="group")
public class Group {
    @Id
    private int id;
    private String name_group;
    @OneToMany
    @JoinColumn(name="group_id")
    private Set<Device> device;

}
