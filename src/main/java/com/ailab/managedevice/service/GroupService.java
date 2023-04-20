package com.ailab.managedevice.service;

import com.ailab.managedevice.entity.Group;
import com.ailab.managedevice.repository.IGroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
    @Autowired
    IGroupRepo repository;
    public Group addGroup (Group group){
        return repository.save(group);
    }
    public String deleteGroup (int id){
        repository.deleteById(id);
        return "Delete succes "+id;
    }

}
