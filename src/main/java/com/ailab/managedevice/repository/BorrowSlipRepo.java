package com.ailab.managedevice.repository;

import com.ailab.managedevice.entity.BorrowSlip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowSlipRepo extends JpaRepository<BorrowSlip, Integer> {
}
