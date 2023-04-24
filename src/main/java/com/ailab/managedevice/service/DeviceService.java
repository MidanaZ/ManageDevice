package com.ailab.managedevice.service;

import com.ailab.managedevice.entity.Device;
import com.ailab.managedevice.repository.DeviceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {
    @Autowired
    DeviceRepo repository;

    public Device addDevice (Device device){
        return repository.save(device);
    }
    public List<Device> getAllDevices (){
        return repository.findAll();
    }
    public Device getDeviceById(int id){
        return repository.findById(id).orElse(null);
    }
    public Device getDeviceByName(String deviceName){
        return repository.findByDeviceName(deviceName);
    }
    public String deleteDevice(int id){
        repository.deleteById(id);
        return "Device deleted " +id;
    }
    public Device updateDevice (Device device){
        Device updevice = repository.findById(device.getId()).orElse(null);
        updevice.setDeviceId(device.getDeviceId());
        updevice.setDeviceName(device.getDeviceName());
        updevice.setDatePurchase(device.getDatePurchase());
        updevice.setDateExpiry(device.getDateExpiry());
        updevice.setImage(device.getImage());
        return repository.save(updevice);
    }
}
