package com.ailab.managedevice.service;

import com.ailab.managedevice.entity.Device;
import com.ailab.managedevice.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {
    @Autowired
    DeviceRepository repository;

    public Device addDevice (Device device){
        return repository.save(device);
    }
    public List<Device> getAllDevices (){
        return repository.findAll();
    }
    public Device getDeviceById(int id){
        return repository.findById(id).orElse(null);
    }
    public Device getDeviceByName(String name_device){
        return repository.findByName(name_device);
    }
    public String deleteDevice(int id){
        repository.deleteById(id);
        return "Device deleted" +id;
    }
    public Device updateDevice (Device device){
        Device updevice = repository.findById(device.getId()).orElse(null);
        updevice.setId_device(device.getId_device());
        updevice.setName_device(device.getName_device());
        updevice.setDate_buy(device.getDate_buy());
        updevice.setExpire_date_warranty(device.getExpire_date_warranty());
        updevice.setImage(device.getImage());
        return repository.save(updevice);
    }
}
