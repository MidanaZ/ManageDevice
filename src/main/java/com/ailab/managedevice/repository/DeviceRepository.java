package com.ailab.managedevice.repository;

import com.ailab.managedevice.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device,Integer> {
    Device findByName(String name_device);
}
