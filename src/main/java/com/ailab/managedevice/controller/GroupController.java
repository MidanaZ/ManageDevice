package com.ailab.managedevice.controller;

import com.ailab.managedevice.entity.Group;
import com.ailab.managedevice.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {
    @Autowired
    GroupService service;

    @PostMapping ("/addGroup")
    public Group addGroup (Group group){
        return service.addGroup(group);
    }
}
