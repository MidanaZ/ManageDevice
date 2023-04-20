package com.ailab.managedevice.repository;

import com.ailab.managedevice.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGroupRepo extends JpaRepository<Group,Integer> {
}
