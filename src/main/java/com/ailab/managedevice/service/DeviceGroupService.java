package com.ailab.managedevice.service;

import com.ailab.managedevice.entity.DeviceGroup;
import com.ailab.managedevice.repository.DeviceGroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceGroupService {
    @Autowired
    DeviceGroupRepo repository;
    public DeviceGroup addGroup (DeviceGroup deviceGroup){
        return repository.save(deviceGroup);
    }
    public String deleteGroup (int id){
        repository.deleteById(id);
        return "Delete success "+id;
    }

}
