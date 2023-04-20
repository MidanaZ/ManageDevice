package com.ailab.managedevice.controller;

import com.ailab.managedevice.entity.Device;
import com.ailab.managedevice.repository.DeviceRepository;
import com.ailab.managedevice.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {
    @Autowired
    DeviceService service;
    @PostMapping("/addDevice")
    public Device addDevice(@RequestBody Device device){
        return service.addDevice(device);
    }

}
