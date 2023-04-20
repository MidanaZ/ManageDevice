package com.ailab.managedevice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name="location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name_location;
    @OneToMany
    @JoinColumn(name="location_id")
    private Set<Device> device;
}

