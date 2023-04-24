package com.ailab.managedevice.controller;

import com.ailab.managedevice.entity.DeviceGroup;
import com.ailab.managedevice.service.DeviceGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/devicemanage")
public class DeviceGroupController {
    @Autowired
    DeviceGroupService service;

    @PostMapping ("/addGroup")
    public DeviceGroup addGroup (DeviceGroup deviceGroup){
        return service.addGroup(deviceGroup);
    }
}
