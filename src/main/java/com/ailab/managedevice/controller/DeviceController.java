package com.ailab.managedevice.controller;

import com.ailab.managedevice.entity.Device;
import com.ailab.managedevice.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/devicemanage")
public class DeviceController {
    @Autowired
    DeviceService service;
    @PostMapping("/addDevice")
    public Device add(@RequestBody Device device){
        return service.addDevice(device);
    }
    @DeleteMapping("/deleteDevice/{id}")
    public String delete(@PathVariable int id){
        return service.deleteDevice(id);
    }
    @PutMapping("/updateDevice")
    public Device update(@RequestBody Device device){
        return service.updateDevice(device);
    }
    @GetMapping("/findDevice/{nameDevice}")
    public Device findByNameDevice(@PathVariable String nameDevice){
        return service.getDeviceByName(nameDevice);
    }

}
