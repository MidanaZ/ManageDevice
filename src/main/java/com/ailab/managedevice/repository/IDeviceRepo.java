package com.ailab.managedevice.repository;

import com.ailab.managedevice.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IDeviceRepo extends JpaRepository<Device,Integer> {
    Device findByNameDevice(String nameDevice);
}
