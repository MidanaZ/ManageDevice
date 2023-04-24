package com.ailab.managedevice.repository;

import com.ailab.managedevice.entity.DeviceCondition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceConditionRepo extends JpaRepository<DeviceCondition, Integer> {
}
