package com.ailab.managedevice.controller;

import com.ailab.managedevice.entity.Device;
import com.ailab.managedevice.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeviceController {
    @Autowired
    DeviceService service;
    @PostMapping("/addDevice")
    public Device addDevice(@RequestBody Device device){
        return service.addDevice(device);
    }
    @DeleteMapping("/deleteDevice/{id}")
    public String deleteDevice(@PathVariable int id){
        return service.deleteDevice(id);
    }
    @PutMapping("/updateDevice")
    public Device updateDevice(@RequestBody Device device){
        return service.updateDevice(device);
    }
    @GetMapping("/Device/{nameDevice}")
    public Device findByNameDevice(@PathVariable String nameDevice){
        return service.getDeviceByName(nameDevice);
    }

}
