package com.ailab.managedevice.repository;

import com.ailab.managedevice.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Integer> {
}
